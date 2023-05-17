package gui;

import javax.swing.*;

import backend.InterfaceDB;
import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ricerca extends JPanel implements ActionListener {
	JPanel fields = new JPanel(new GridLayout(2, 2));
	JPanel btns = new JPanel(new FlowLayout());
	JPanel resultsPanel = new JPanel(new FlowLayout());
	
	JTextField insTF = new JTextField();
	String[] opzBO = {"-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
	JComboBox<String> bloccoOrarioCB = new JComboBox<String>(opzBO);
	
	JButton search = new JButton("Ricerca");
	JButton rtrn = new JButton("Ritorna");
	
	JLabel results = new JLabel("Hi");
	
	
	public Ricerca (JPanel window) {
		fields.add(insTF);
		fields.add(bloccoOrarioCB);
		
		btns.add(search);
		btns.add(rtrn);
		
		resultsPanel.add(results);
		
		this.add(fields);
		this.add(btns);
		this.add(resultsPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == search) {
			if(!insTF.getText().equals("") || bloccoOrarioCB.getSelectedIndex() != 0) {
				
			}
		}
		
	}
}
