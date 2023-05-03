package gui;

import javax.swing.*;

import backend.InterfaceDB;
import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertAulaGUI extends JPanel implements ActionListener {
	JPanel mainPanelCard = Frame.mainPanelCard;
	JPanel mainWindowPanel = new JPanel();
	
	JLabel codice = new JLabel("Codice");
	JTextField codiceTF = new JTextField();
	JLabel capacita = new JLabel("Capacità");
	JTextField capacitaTF = new JTextField();

	JButton insert = new JButton("Inserisci");
	
	public InsertAulaGUI(JPanel mainPanel) {
		
		insert.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				 if(!codiceTF.getText().equals("") && !capacitaTF.getText().equals("")) {
						InterfaceDB.InsertAula(codiceTF.getText(), Integer.parseInt(capacitaTF.getText()));
					 	CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
		                cardLayout.show(Frame.window, "1");
					}
					else {
						JOptionPane.showMessageDialog(null, "COMPILARE TUTTI I CAMPI", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
	            }
       });
		
		mainWindowPanel.add(codice);
		mainWindowPanel.add(codiceTF);
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
