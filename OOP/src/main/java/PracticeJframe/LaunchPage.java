/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeJframe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author lbpsantos
 */
public class LaunchPage extends JFrame {

    JButton button;

    public LaunchPage() {
        this.setTitle("Test Window");
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x1c7873));
        this.setLayout(null);
        
        JTextField text = new JTextField();
        text.setBounds(100, 50, 200, 50);


        button = new JButton("Enter");
        button.setBounds(120, 120, 100, 30);
        button.addActionListener(e -> {
            String input = text.getText();
            if(input.equalsIgnoreCase("Alejandro")){
                 NewWindow nw = new NewWindow();
            }
  
            this.dispose();
            

        });
        
        this.add(text);
        this.add(button);
        this.setVisible(true);

    }

}
