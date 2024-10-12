/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermGroupLabAct;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainPage extends JFrame {

   
    JButton loginButton;

    public MainPage() {
        this.setTitle("Main Page");
        this.setSize(800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x1c4d90));
        this.setLayout(null);

        //window icon dont forget!
        
        // Caption
        JLabel sn = new JLabel();
        sn.setText("Ateneo de Davao University");
        sn.setFont(new Font("Arial", Font.BOLD, 29));  // Make the font larger if needed
        sn.setForeground(Color.WHITE);  // Set text color for better visibility
        sn.setBounds(200, 50, 400, 50);  // Centered in a 800px wide window

        //Username label and textfield
        JLabel un = new JLabel();
        un.setText("USERNAME:");
        un.setFont(new Font("Arial", Font.BOLD, 15));
        un.setForeground(Color.WHITE);
        un.setBounds(190, 120, 100, 30);
        
        JTextField userName = new JTextField();
        userName.setBounds(300, 120, 200, 30);

        //Password label and textfield
        JLabel pw = new JLabel();
        pw.setText("PASSWORD:");
        pw.setFont(new Font("Arial", Font.BOLD, 15));
        pw.setForeground(Color.WHITE);
        pw.setBounds(190, 160, 100, 30);
        
        JTextField passWord = new JTextField();
        passWord.setBounds(300, 160, 200, 30);

        // Button for Log in in the Main Page
        loginButton = new JButton("LOGIN");
        loginButton.setBounds(300, 210, 200, 50);  // Centered horizontally
        loginButton.addActionListener(e -> {
            String username = un.getText();
            
            this.dispose();
            ProfessorPage pp = new ProfessorPage();
        });

        
        //caption
        this.add(sn);

        //username
        this.add(userName);
        this.add(un);

        //password
        this.add(pw);
        this.add(passWord);

        //login button
        this.add(loginButton);

        //mainpage frame
        this.setVisible(true);
    }
}
