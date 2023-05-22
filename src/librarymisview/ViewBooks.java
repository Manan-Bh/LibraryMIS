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

public class ViewBooks {
    private JFrame frame;
    private JTable table;

    public ViewBooks() {
        frame = new JFrame("Book Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);

        fetchBooksFromDatabase();

        frame.setVisible(true);
    }

    public void fetchBooksFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/libraryinfo";
        String username = "root";
        String password = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT Name, Genre, Price FROM books";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Name");
            model.addColumn("Genre");
            model.addColumn("Price");

            while (resultSet.next()) {
                String bookName = resultSet.getString("Name");
                String bookGenre = resultSet.getString("Genre");
                double bookPrice = resultSet.getDouble("Price");

                model.addRow(new Object[]{bookName, bookGenre, bookPrice});
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

      
    

   


    


