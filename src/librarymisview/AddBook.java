/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class AddBook {
        public AddBook(){
       JFrame frame = new JFrame("Enter Book Details");
        frame.setLayout(new GridLayout(2,1));
        JLabel addL1 = new JLabel("Book Name");
        JTextField addTf1 = new JTextField(30);
        JLabel addL2 = new JLabel("Genre");
        JTextField addTf2 = new JTextField(30);
        JLabel addL3 = new JLabel("Price");
        JTextField addTf3 = new JTextField(30);

        JButton jb1 = new JButton("Submit");
        jb1.setBounds(20,50,40,30);
        
        
        
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout(3,2));
        jp1.add(addL1);
        jp1.add(addTf1);
        jp1.add(addL2);
        jp1.add(addTf2);
        jp1.add(addL3);
        jp1.add(addTf3);

        
        jp2.setLayout(new BorderLayout());
        jp2.add(jb1,BorderLayout.CENTER);
        frame.add(jp1);
        frame.add(jp2);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println("Before performed");
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookName = addTf1.getText();
                String genre = addTf2.getText();
                int price = Integer.parseInt(addTf3.getText());
                System.out.println("Before pass to library");
                Library libObj = new Library();
                libObj.addBook(bookName, genre, price);
            }
        });
        
    }
}


