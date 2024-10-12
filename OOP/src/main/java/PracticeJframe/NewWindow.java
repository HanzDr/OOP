/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeJframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewWindow extends JFrame {

    JButton button;

    public NewWindow() {
        this.setTitle("Test Window");
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x1c7873));
        this.setLayout(null);

        JLabel label = new JLabel(); //creates a label
        label.setText("");
    
        
        ImageIcon image2 = new ImageIcon("C:\\Users\\lbpsantos\\Documents\\NetBeansProjects\\OOP\\alejandro.jpg");
        label.setIcon(image2);
        
        label.setBounds(50, 50, 300, 300);

        this.add(label);
        this.setVisible(true);

    }
}
