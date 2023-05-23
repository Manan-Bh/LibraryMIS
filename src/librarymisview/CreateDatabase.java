/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymisview;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Wajahat
 */
public class CreateDatabase extends JFrame{
    
    public CreateDatabase(){
    
       


        JPanel panel = new JPanel(new FlowLayout());
        getContentPane().add(panel);

        JLabel dbL = new JLabel("Enter Database Name:");
        panel.add(dbL);
        
        JTextField jtf = new JTextField(20);
        panel.add(jtf);
        
        JButton jb1 = new JButton("Create");
        panel.add(jb1);
        
        add(panel);

    
    setTitle("Database Creation");
    setSize(500,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
    
     jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String dbName = dbL.getText();
            Library lib = new Library();
            lib.CreateDB(dbName);
            }
        });
        
    }
    
    }
    


