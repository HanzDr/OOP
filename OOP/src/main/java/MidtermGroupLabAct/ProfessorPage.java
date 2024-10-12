
package MidtermGroupLabAct;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**PhoneNumber:
//EmployeeID:
//Department:
//Title: PhD in Mathematics

 *
 * @author Don
 */
public class ProfessorPage extends JFrame {
    JLabel lName, lAge,lGender, lAddress, lPhoneNumber, lEmployeeID, lDepartment, lTitle;
    JButton aButton,rButton, vButton;
    public ProfessorPage() {
        this.setTitle("Main Page");
        this.setSize(800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x1c4d90));
        this.setLayout(null);

       
//Panel for professor and person details
       JPanel pan = new JPanel();
       pan.setBounds(30, 30, 725, 190);        
       pan.setBackground(new Color(0xffffff));
       
       // Label for NAME
       lName = new JLabel();
       lName.setText("Name: ");
       lName.setBounds(50,30,150,70);
       lName.setFont(new Font("Arial", Font.BOLD, 12));
       lName.setForeground(new Color(0x000000));
       
       
       // Label for AGE
       lAge = new JLabel();
       lAge.setText("Age:");
       lAge.setBounds(50,70,150,70);
       lAge.setFont(new Font("Arial", Font.BOLD, 12));
       lAge.setForeground(new Color(0x000000));
       
       lGender = new JLabel();
       lGender.setText("Gender: ");
       lGender.setBounds(50,110,150,70);
       lGender.setFont(new Font("Arial", Font.BOLD, 12));
       lGender.setForeground(new Color(0x000000));
       
       lAddress = new JLabel();
       lAddress.setText("Address: ");
       lAddress.setBounds(50,150,150,70);
       lAddress.setFont(new Font("Arial", Font.BOLD, 12));
       lAddress.setForeground(new Color(0x000000));
       
       lPhoneNumber = new JLabel();
       lPhoneNumber.setText("Phone Number: ");
       lPhoneNumber.setBounds(400,30,150,70);
       lPhoneNumber.setFont(new Font("Arial", Font.BOLD, 12));
       lPhoneNumber.setForeground(new Color(0x000000));
       
       lEmployeeID = new JLabel();
       lEmployeeID.setText("Employee ID: ");
       lEmployeeID.setBounds(400,70,150,70);
       lEmployeeID.setFont(new Font("Arial", Font.BOLD, 12));
       lEmployeeID.setForeground(new Color(0x000000));
       
       lDepartment = new JLabel();
       lDepartment.setText("Department: ");
       lDepartment.setBounds(400,110,150,70);
       lDepartment.setFont(new Font("Arial", Font.BOLD, 12));
       lDepartment.setForeground(new Color(0x000000));
       
       lTitle = new JLabel();
       lTitle.setText("Title: ");
       lTitle.setBounds(400,150,150,70);
       lTitle.setFont(new Font("Arial", Font.BOLD, 12));
       lTitle.setForeground(new Color(0x000000));
       
       //Add Button
       aButton = new JButton("Add");
       aButton.setBounds(60, 270, 160, 40);
       
       //Remove button
       rButton = new JButton("Remove");
       rButton.setBounds(320, 270, 160, 40);
       
       //view button
       vButton = new JButton("View List");
       vButton.setBounds(570, 270, 160, 40);
       
       
       
       
        this.add(aButton);
        this.add(vButton);
        this.add(rButton);
        this.add(lName);
        this.add(lAge);
        this.add(lPhoneNumber);
        this.add(lGender);
        this.add(lAddress);
        this.add(lDepartment);
        this.add(lEmployeeID);
        this.add(lTitle);
        
        this.add(pan);
        this.setVisible(true);
    }

}