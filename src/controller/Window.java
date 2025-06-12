package controller;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Window extends JFrame{

public Window() {
		
		setSize(600, 400);
		//I configure the size and default colors for the windows
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		UIManager.put("Panel.background", new Color(245, 245, 220));
		getContentPane().setBackground(new Color(245, 245, 220)); 
	
	}
	
}
