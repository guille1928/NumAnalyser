package view;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controller.Database;

public class View extends JFrame {
	
	public boolean insertNumbers (Date date1, int num1, int num2, int num3, int num4, int num5, int star, int star2) {
	
		try {
			Connection conn =Database.connect();
			String sql = "INSERT INTO numbers (date1,num1,num2,num3,num4,num5,star,star2) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement pST = conn.prepareStatement(sql);
			pST.setDate(1, date1);
			pST.setInt(2, num1);
			pST.setInt(3, num2);
			pST.setInt(4, num3);
			pST.setInt(5, num4);
			pST.setInt(6, num5);
			pST.setInt(7, star);
			pST.setInt(8, star2);
			pST.execute();
			
			System.out.println("Values inserted");
			return true;
			
			} catch (Exception e) {
				System.out.println("Error inserting values" + e);
				
			}
		
		
	return false;	
	}
	
    public View() {
        setSize(800, 400);
        // Configure the size and default colors for the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelContent = new JPanel();
        panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
        panelContent.setPreferredSize(new Dimension(400, 300));

        // Create the panels to group the fields
        JPanel numPanel = new JPanel();
        numPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Increased space between components

        JPanel okButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel okButton1LB = new JLabel();
        JButton okButton2 = new JButton("Submit");
        JLabel exitButtonLB = new JLabel();
        JButton exitButton1 = new JButton("Exit");
        
        okButtonPanel.add(okButton1LB);
        okButtonPanel.add(okButton2);
        okButtonPanel.add(exitButtonLB);
        okButtonPanel.add(exitButton1);
        // Create labels and text fields with a slightly larger size
        Font largerFont = new Font("Arial", Font.PLAIN, 12); // Larger font size for labels and text fields
        
        JLabel labelDate = new JLabel("Date:");
        labelDate.setFont(largerFont);
        JTextField textDate = new JTextField(3); // Slightly larger text field width
        textDate.setFont(largerFont);
        textDate.setPreferredSize(new Dimension(40, 25)); 
        
        
        JLabel labelNum1 = new JLabel("Num 1:");
        labelNum1.setFont(largerFont);
        JTextField textNum1 = new JTextField(3); // Slightly larger text field width
        textNum1.setFont(largerFont);
        textNum1.setPreferredSize(new Dimension(40, 25)); // Slightly bigger size for the text field

        JLabel labelNum2 = new JLabel("Num 2:");
        labelNum2.setFont(largerFont);
        JTextField textNum2 = new JTextField(3);
        textNum2.setFont(largerFont);
        textNum2.setPreferredSize(new Dimension(40, 25));

        JLabel labelNum3 = new JLabel("Num 3:");
        labelNum3.setFont(largerFont);
        JTextField textNum3 = new JTextField(3);
        textNum3.setFont(largerFont);
        textNum3.setPreferredSize(new Dimension(40, 25));

        JLabel labelNum4 = new JLabel("Num 4:");
        labelNum4.setFont(largerFont);
        JTextField textNum4 = new JTextField(3);
        textNum4.setFont(largerFont);
        textNum4.setPreferredSize(new Dimension(40, 25));

        JLabel labelNum5 = new JLabel("Num 5:");
        labelNum5.setFont(largerFont);
        JTextField textNum5 = new JTextField(3);
        textNum5.setFont(largerFont);
        textNum5.setPreferredSize(new Dimension(40, 25));

        JLabel labelNumstar = new JLabel("Star 1:");
        labelNumstar.setFont(largerFont);
        JTextField textNumstar = new JTextField(3);
        textNumstar.setFont(largerFont);
        textNumstar.setPreferredSize(new Dimension(40, 25));

        JLabel labelNumstar2 = new JLabel("Star 2:");
        labelNumstar2.setFont(largerFont);
        JTextField textNumstar2 = new JTextField(3);
        textNumstar2.setFont(largerFont);
        textNumstar2.setPreferredSize(new Dimension(40, 25));

        // Add fields and labels to the numPanel
        numPanel.add(labelNum1);
        numPanel.add(textNum1);
        numPanel.add(labelNum2);
        numPanel.add(textNum2);
        numPanel.add(labelNum3);
        numPanel.add(textNum3);
        numPanel.add(labelNum4);
        numPanel.add(textNum4);
        numPanel.add(labelNum5);
        numPanel.add(textNum5);
        numPanel.add(labelNumstar);
        numPanel.add(textNumstar);
        numPanel.add(labelNumstar2);
        numPanel.add(textNumstar2);
        numPanel.add(labelDate);

        // Add the numPanel and button to the panelContent
        panelContent.add(numPanel);
        panelContent.add(okButtonPanel);

        // Add the panelContent to the JFrame
        add(panelContent);
        
        //get the values from the user
        int num1 = Integer.parseInt(textNum1.getText().trim());
        int num2 = Integer.parseInt(textNum2.getText().trim());
        int num3 = Integer.parseInt(textNum3.getText().trim());
        int num4 = Integer.parseInt(textNum4.getText().trim());
        int num5 = Integer.parseInt(textNum5.getText().trim());
        int star = Integer.parseInt(textNumstar.getText().trim());
        int star2 = Integer.parseInt(textNumstar2.getText().trim());
       
        okButton2.addActionListener(e->{
        	//we call the function that inserts the valeues
        	//insertNumbers(num2, num1,num2,num3,num4,num5,star,star2);
        	
        });
        
        
    }
    //im at the point of validating the DATE and its format 
    
    
    public static void main(String[] args) {
        // Create the window and make it visible
        View wellcome = new View();
        wellcome.setVisible(true);
    }
}
