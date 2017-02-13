/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import javax.swing.*;

/**
 *
 * @author ksalonikidis
 */
public class MyFrame extends JFrame{
    
    private JPanel panel;
    private JTextField textField;
    private JButton button;
    
    
    public MyFrame(){
    
    panel =new JPanel(); //Βήμα 1. Κατασκευή υποδοχέα.   
    textField=new JTextField(10); //Βήμα 2
    button=new JButton("Press Me");     //Δημιουργία γραφικών
    panel.add(textField); //Βήμα 3
    panel.add(button); // Προσθήκη γραφικών συστατικών στο panel
    
    this.setContentPane(panel); //Βήμα 4 Προσαρμογή υποδοχέα.
    
    this.setVisible(true);
    this.setSize(400, 400);
    this.setTitle("It is my Frame!!");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
}
