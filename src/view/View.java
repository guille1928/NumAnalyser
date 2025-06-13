package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

//here we create the main wellcome window

public class View extends JFrame {

	public View() {
		setSize(600, 400);
		// I configure the size and default colors for the windows
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		UIManager.put("Panel.background", new Color(245, 245, 220));
		getContentPane().setBackground(new Color(245, 245, 220));

		JPanel panelContent = new JPanel();
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		panelContent.setPreferredSize(new Dimension(400, 300));
		

	
		// Crear los paneles para agrupar los campos
		JPanel numPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel labelNum1 = new JLabel("Number 1:");
		JTextField textNum1 = new JTextField(5);
		JLabel labelNum2 = new JLabel("Number 2:");
		JTextField textNum2 = new JTextField(5);
		JLabel labelNum3 = new JLabel("Number 3:");
		JTextField textNum3 = new JTextField(5);
		JLabel labelNum4 = new JLabel("Number 4:");
		JTextField textNum4 = new JTextField(5);
		JLabel labelNum5 = new JLabel("Number 5:");
		JTextField textNum5 = new JTextField(5);
		JLabel labelNumstar = new JLabel("First star:");
		JTextField textNumstar = new JTextField(5);
		JLabel labelNumstar2 = new JLabel("Second star:");
		JTextField textNumstar2 = new JTextField(5);
		//number panel
		numPanel.add(labelNum1);
		numPanel.add(textNum1);
		numPanel.add(labelNum2);
		numPanel.add(textNum2);
		numPanel.add(labelNum3);
		numPanel.add(textNum3);
		numPanel.add(textNum4);
		numPanel.add(labelNum4);
		numPanel.add(textNum5);
		numPanel.add(labelNum5);
		
		//2 star
		numPanel.add(labelNumstar);
		numPanel.add(textNumstar);
		numPanel.add(labelNumstar2);
		numPanel.add(textNumstar2);

		panelContent.add(numPanel);
	;
		
		add(panelContent);
		
		
	}

	public static void main(String[] args) {
		View wellcome = new View();
		wellcome.setVisible(true);

	}

}
