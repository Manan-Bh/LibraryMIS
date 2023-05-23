/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Wajahat
 */
public class AdminFunctionsView extends JFrame{
     public AdminFunctionsView() {
        JPanel jp1 = new JPanel();
        JButton jb1 = new JButton("View Books");
        JButton jb2 = new JButton("View Users");
        JButton jb3 = new JButton("View Issued Books");
        JButton jb4 = new JButton("Issue Book");
        JButton jb5 = new JButton("Add User");
        JButton jb6 = new JButton("Add Book");
        JButton jb7 = new JButton("Return Book");
        JButton jb8 = new JButton("Create/Reset");

        jp1.setLayout(new FlowLayout());
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp1.add(jb7);
        jp1.add(jb8);
        add(jp1);
        setSize(500, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to show the available books table from the database
                ViewBooks obj = new ViewBooks();
                
            }
        });

        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to show the users table from the database
                ViewBooks vb = new ViewBooks();
            }
        });

        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to show the issued books table from the database
            }
        });

        jb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            IssueBook isObj2 = new IssueBook();

                // Call function from DAO class to issue a book
            }
        });

        jb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddUser addU = new AddUser();
                // Call function from DAO class to show the add user method
            }
        });

        jb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddBook addObj = new AddBook();
                // Call function from DAO class to show the add book method
            }
        });

        jb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to return a book
                ReturnBook retB = new ReturnBook();
            }
        });

        jb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to reset the database
                CreateDatabase cDb = new CreateDatabase();
            }
        });
    }
    
}
