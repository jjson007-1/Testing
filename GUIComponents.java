/*package serialization;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GUIComponents {
  public static void main(String[] args) {
		new GUIComponents();
	}
}*/
 package serialization;

import javax.swing.*;
import java.awt.*;

public class GUIComponents {
    private static JFrame frame;
    private static JLabel headerLabel;
    private static JTextField nameField, emailField;
    private static JButton submitButton, cancelButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());
        
        // Initialize components
        headerLabel = new JLabel("Equipment Rental", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerLabel.setForeground(Color.BLUE);
        
        
        nameField = new JTextField();
        emailField = new JTextField();
        
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        
        // Add components to frame
        frame.add(headerLabel, BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        panel.add(new JLabel("Enter ID"));
        panel.add(nameField);
        
        panel.add(new JLabel("Enter Password"));
        panel.add(emailField);
        
        panel.add(submitButton);
        panel.add(cancelButton);
        
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}
