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
public class ReturnBook extends JFrame{
    
    public ReturnBook(){
           JFrame frame = new JFrame("Enter Details");
        frame.setLayout(new GridLayout(2,1));
        JLabel RetL1 = new JLabel("Book ID(BID)");
        JTextField RetTf1 = new JTextField(30);
        JLabel RetL2 = new JLabel("User ID(UID)");
        JTextField RetTf2 = new JTextField(30);
        
        JButton jb1 = new JButton("Return");
        jb1.setBounds(20,50,40,30);
        
        
        
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout(2,2));
        jp1.add(RetL1);
        jp1.add(RetTf1);
        jp1.add(RetL2);
        jp1.add(RetTf2);
        
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
                int bookID = Integer.parseInt(RetTf1.getText());
                int userID = Integer.parseInt(RetTf2.getText());

                
                Library libObj = new Library();
                libObj.ReturnBook(bookID, userID);

            }
        });
}
}

