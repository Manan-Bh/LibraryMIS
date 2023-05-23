/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddUser {
        public AddUser(){
    JFrame frame = new JFrame("Enter User Details");
    frame.setLayout(new GridLayout(2,1));
    JLabel adduL1 = new JLabel("UID");
        JTextField adduTf1 = new JTextField(30);
        JLabel adduL2 = new JLabel("Username");
        JTextField adduTf2 = new JTextField(30);
        JLabel adduL3 = new JLabel("Password");
        JTextField adduTf3 = new JTextField(30);
        JLabel adduL4 = new JLabel("Admin");
        JTextField adduTf4 = new JTextField(30);

        JButton jb1 = new JButton("Submit");
        jb1.setBounds(20,50,40,30);
        
        
        
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout(4,2));
        jp1.add(adduL1);
        jp1.add(adduTf1);
        jp1.add(adduL2);
        jp1.add(adduTf2);
        jp1.add(adduL3);
        jp1.add(adduTf3);
        jp1.add(adduL4);
        jp1.add(adduTf4);

        
        jp2.setLayout(new BorderLayout());
        jp2.add(jb1,BorderLayout.CENTER);
        frame.add(jp1);
        frame.add(jp2);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
         jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call function from DAO class to return a book
                int userID = Integer.parseInt(adduTf1.getText());
                String username = adduTf2.getText();
                String password = adduTf3.getText();
                boolean admin = Boolean.parseBoolean(adduTf4.getText());
                
                Library libObj = new Library();
                libObj.addUser(userID, username, password, admin);
//                
//                LibraryDAO dao = new LibraryDAO();
//                dao.CreateAddUser(libObj);
            }
        });
        
        
}
}
