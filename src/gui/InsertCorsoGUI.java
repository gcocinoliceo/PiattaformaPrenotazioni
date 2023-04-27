package gui;

import javax.swing.*;

import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertCorsoGUI extends JPanel implements ActionListener {
	JPanel mainPanelCard = Frame.mainPanelCard;
	JPanel mainWindowPanel = new JPanel();
	
	JLabel piano = new JLabel("Nome");
	JTextField pianoTF = new JTextField();
	JLabel capacita = new JLabel("Descrizione");
	JTextField capacitaTF = new JTextField();
	JLabel insegnante = new JLabel("Insegnante"); // COMBO BOX \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
	JTextField insegnanteTF = new JTextField();
	JLabel aula = new JLabel("Aula");
	JTextField aulaTF = new JTextField();

	JButton insert = new JButton("Inserisci");
	
	public InsertCorsoGUI(JPanel mainPanel) {
		
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
		mainWindowPanel.add(insegnante);
		mainWindowPanel.add(insegnanteTF);
		mainWindowPanel.add(aula);
		mainWindowPanel.add(aulaTF);

		
		mainWindowPanel.add(insert);
		
		mainWindowPanel.setLayout(new GridLayout(9, 1, 20, 20));  
		
		this.add(mainWindowPanel);
		this.setSize(400, 500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
