/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class LibraryDAO {
     public void CreateAddUser(int userId, String un, String pass, boolean adm){
        int uid = userId;
        String username = un;
        String password = pass;
        boolean admin = adm;
        
        PreparedStatement preparedStatement = null;
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LibraryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryinfo","root","");
            String query = "insert into user(UID,Username,Password,Admin) VALUES (?,?,?,?)";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setDouble(1, uid);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setBoolean(4, admin);

            preparedStatement.executeUpdate();

        System.out.println("before Exception");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
         AdminFunctionsView obj = new AdminFunctionsView();
    }
    
    public void CreateIssueBook(int bID, int uID, int period, String issueDate){
        PreparedStatement preparedStatement = null;
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LibraryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryinfo","root","");
            String query = "insert into issued(BookID,UserID,IssuePeriod,IssuedDate) VALUES (?,?,?,?)";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setDouble(1, bID);
        preparedStatement.setDouble(2, uID);
        preparedStatement.setDouble(3, period);
        preparedStatement.setString(4, issueDate);
        preparedStatement.executeUpdate();
        System.out.println("before Exception");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        AdminFunctionsView obj = new AdminFunctionsView();
        
    }
    
    
    public void CreateAddBook(String n, String g, int p){
        String name=n;
        String genre = g;
        int price = p;
        System.out.println("hello");
        PreparedStatement preparedStatement = null;
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LibraryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryinfo","root","");
            String query = "insert into books(Name,Genre,Price) VALUES (?,?,?)";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, name);
            preparedStatement.setString(2, genre);
            preparedStatement.setDouble(3, price);
            preparedStatement.executeUpdate();
        System.out.println("before Exception");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
         AdminFunctionsView obj = new AdminFunctionsView();
        
    }
    public void createDatabase(String dbN){
        String name=dbN;
        System.out.println("in dao");

        PreparedStatement preparedStatement = null;
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LibraryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryinfo","root","");
            String query = "create database ?";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        System.out.println("before Exception");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
        AdminFunctionsView obj = new AdminFunctionsView();
    }
        
    
    

public void RetBook(int bID, int uID){
      PreparedStatement preparedStatement = null;
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LibraryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryinfo","root","");
        String query = "delete from issued where BookID = ?";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setDouble(1, bID);
        preparedStatement.executeUpdate();
        System.out.println("before Exception");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        AdminFunctionsView obj = new AdminFunctionsView();
        
    }
        
    }

