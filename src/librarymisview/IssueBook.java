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
public class IssueBook {
     public IssueBook(){
       JFrame frame = new JFrame("Enter Details");
        frame.setLayout(new GridLayout(2,1));
        JLabel IssueL1 = new JLabel("Book ID(BID)");
        JTextField issueTf1 = new JTextField(30);
        JLabel IssueL2 = new JLabel("User ID(UID)");
        JTextField issueTf2 = new JTextField(30);
        JLabel IssueL3 = new JLabel("Period(days)");
        JTextField issueTf3 = new JTextField(30);
        JLabel IssueL4 = new JLabel("Issued Date(DD-MM-YYYY)");
        JTextField issueTf4 = new JTextField(30);
        JButton jb1 = new JButton("Submit");
        jb1.setBounds(20,50,40,30);
        
        
        
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout(4,2));
        jp1.add(IssueL1);
        jp1.add(issueTf1);
        jp1.add(IssueL2);
        jp1.add(issueTf2);
        jp1.add(IssueL3);
        jp1.add(issueTf3);
        jp1.add(IssueL4);
        jp1.add(issueTf4);
        
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
                int bookID = Integer.parseInt(issueTf1.getText());
                int userID = Integer.parseInt(issueTf2.getText());
                int period = Integer.parseInt(issueTf3.getText());
                String dateIssued = issueTf4.getText();
                
                Library libObj = new Library();
                libObj.issueBook(bookID, userID, period, dateIssued);
                
            }
        });
}
}
