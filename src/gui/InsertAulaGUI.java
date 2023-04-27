package gui;

import javax.swing.*;

import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertAulaGUI extends JPanel implements ActionListener {
	JPanel mainPanelCard = Frame.mainPanelCard;
	JPanel mainWindowPanel = new JPanel();
	
	JLabel piano = new JLabel("Piano");
	JTextField pianoTF = new JTextField();
	JLabel capacita = new JLabel("Capacità");
	JTextField capacitaTF = new JTextField();

	JButton insert = new JButton("Inserisci");
	
	public InsertAulaGUI(JPanel mainPanel) {
		
		insert.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
	                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
	                cardLayout.show(Frame.window, "1");
	            }
       });
		
		mainWindowPanel.add(piano);
		mainWindowPanel.add(pianoTF);
		mainWindowPanel.add(capacita);
		mainWindowPanel.add(capacitaTF);
		
		mainWindowPanel.add(insert);
		
		mainWindowPanel.setLayout(new GridLayout(5, 1, 20, 20));  
		
		this.add(mainWindowPanel);
		this.setSize(400, 500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
