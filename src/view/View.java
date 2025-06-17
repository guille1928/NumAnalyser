package view;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class View extends JFrame {
	
	
    public View() {
    	setSize(800, 400);
        // Configure the size and default colors for the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelContent = new JPanel();
        panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS)); // Stack everything vertically

        // Create panels to group the fields
        JPanel numPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));  // Number fields panel
        JPanel starPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Star fields panel
        JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Date fields panel
        JPanel okButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel for buttons

        // Font for labels and text fields
        Font largerFont = new Font("Arial", Font.PLAIN, 12); 

        // Labels and text fields for the numbers (Num 1 to Num 5)
        JLabel labelNum1 = new JLabel("Num 1:");
        labelNum1.setFont(largerFont);
        JTextField textNum1 = new JTextField(3);
        textNum1.setFont(largerFont);
        textNum1.setPreferredSize(new Dimension(40, 25));

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

        // Add the number fields (Num 1 to Num 5) to the numPanel (top section)
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

        // Labels and text fields for the stars (Star 1 and Star 2)
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

        // Add the star fields (Star 1 and Star 2) to the starPanel
        starPanel.add(labelNumstar);
        starPanel.add(textNumstar);
        starPanel.add(labelNumstar2);
        starPanel.add(textNumstar2);

        // Labels and text fields for the date
        JLabel labelDate = new JLabel("Date:");
        labelDate.setFont(largerFont);
        JTextField textDate = new JTextField(9); // Slightly larger text field width
        textDate.setFont(largerFont);
        textDate.setPreferredSize(new Dimension(40, 25)); 

        // Add the date field to the datePanel
        datePanel.add(labelDate);
        datePanel.add(textDate);

        // Button Panel for submitting and exiting
        JLabel okButton1LB = new JLabel();
        JButton okButton2 = new JButton("Submit");
        JLabel exitButtonLB = new JLabel();
        JButton exitButton1 = new JButton("Exit");
        okButtonPanel.add(okButton1LB);
        okButtonPanel.add(okButton2);
        okButtonPanel.add(exitButtonLB);
        okButtonPanel.add(exitButton1);

        // Add the panels to the main content panel
        panelContent.add(numPanel); // Numbers at the top
        panelContent.add(starPanel); // Stars below numbers
        panelContent.add(datePanel); // Date below stars
        panelContent.add(okButtonPanel); // Buttons at the bottom

        // Add the panelContent to the JFrame
        add(panelContent);
        
        //close the program
        exitButton1.addActionListener(e->{
         System.exit(ABORT)	;
        });
        //if the user cliks ok, we call the function
		okButton2.addActionListener(e -> {
			try {
				// get the values from the user
				String dateUser = textDate.getText().trim();
				// Validar y convertir la fecha al formato adecuado
				java.sql.Date date = java.sql.Date.valueOf(dateUser);
				int num1 = Integer.parseInt(textNum1.getText().trim());
				int num2 = Integer.parseInt(textNum2.getText().trim());
				int num3 = Integer.parseInt(textNum3.getText().trim());
				int num4 = Integer.parseInt(textNum4.getText().trim());
				int num5 = Integer.parseInt(textNum5.getText().trim());
				int star = Integer.parseInt(textNumstar.getText().trim());
				int star2 = Integer.parseInt(textNumstar2.getText().trim());
				// we call the function that inserts the values
				boolean result = controller.Control.insertNumbers2(date, num1, num2, num3, num4, num5, star, star2);

				if (result) {

					JOptionPane.showMessageDialog(this, "Success on the query");

				} else {
					JOptionPane.showMessageDialog(this, "Error inserting data");
				}

			} catch (IllegalArgumentException ex) {
		        // Handle invalid date format
		        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-mm-dd.");
		    }catch (Exception ex) {
		        // Handle any other exceptions that might occur
		        JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage());
		    }

		});
        
        
    }
    //im at the point of validating the DATE and its format 
    
    
    public static void main(String[] args) {
        // Create the window and make it visible
        View wellcome = new View();
        wellcome.setVisible(true);
    }
}
