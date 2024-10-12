/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setVisible(true);
        this.setTitle("Title put here!");
        this.setSize(450, 260);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);

        ImageIcon image = new ImageIcon("C:\\Users\\lbpsantos\\Documents\\NetBeansProjects\\OOP\\tap.jpg");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(0x606d82));
        
        JLabel label = new JLabel(); //creates a label
        label.setText("Label here!");
    
        
        ImageIcon image2 = new ImageIcon("C:\\Users\\lbpsantos\\Documents\\NetBeansProjects\\OOP\\tap.jpg");
        label.setIcon(image2);
        
        this.add(label);
        
    }

}
