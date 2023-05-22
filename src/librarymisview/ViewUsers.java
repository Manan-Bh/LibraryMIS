/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;





import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ViewUsers {
    private JFrame frame;
    private JTable table;

    public ViewUsers() {
        frame = new JFrame("Book Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);

        fetchUsersFromDatabase();

        frame.setVisible(true);
    }

    public void fetchUsersFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/libraryinfo";  
        String username = "root";
        String password = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT UID, Username, Password, Admin FROM user";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("UID");
            model.addColumn("Username");
            model.addColumn("Password");
            model.addColumn("Admin");

            while (resultSet.next()) {
                double userID = resultSet.getDouble("UID");
                String Username = resultSet.getString("Username");
                String Password = resultSet.getString("Password");
                boolean Admin = resultSet.getBoolean("Admin");

                model.addRow(new Object[]{userID, Username, Password,Admin});
            }
            table.setModel(model);
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}