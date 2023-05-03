package gui;
import backend.InterfaceDB;

import java.sql.*;
import javax.swing.*;

import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertCorsoGUI extends JPanel implements ActionListener {
	JPanel mainPanelCard = Frame.mainPanelCard;
	JPanel mainWindowPanel = new JPanel();
	
	JLabel nome = new JLabel("Nome");
	JTextField nomeTF = new JTextField();
	JLabel desc = new JLabel("Descrizione");
	JTextField descTF = new JTextField();
	JLabel bloccoOrario = new JLabel("bloccoOrario");
	JLabel insegnante = new JLabel("Insegnante"); 
	JLabel aula = new JLabel("Aula");
	
	String[] items = {};
    JComboBox<String> insegnanteCB = new JComboBox<>(items);
    JComboBox<String> aulaCB = new JComboBox<>(items);
     
    String[] opzBO = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    JComboBox<String> bloccoOrarioCB = new JComboBox<String>(opzBO); // use opzBO
	

	JButton insert = new JButton("Inserisci");
	
	public InsertCorsoGUI(JPanel mainPanel) {
		
		insert.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
					if(!nomeTF.getText().equals("") && !descTF.getText().equals("") && !bloccoOrario.getText().equals("")) {
						InterfaceDB.InsertCorso(nomeTF.getText(), descTF.getText(), bloccoOrarioCB.getSelectedIndex()+1, insegnanteCB.getSelectedIndex()+1, aulaCB.getSelectedIndex()+1);
					 	CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
		                cardLayout.show(Frame.window, "1");
					}
					else {
						JOptionPane.showMessageDialog(null, "COMPILARE TUTTI I CAMPI", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
	            }
       });
		
		ResultSet item = InterfaceDB.GetInsegnanti();
		try {
			while(item.next()) {
		
				System.out.println(item.getInt(1)+"-"+item.getString(2)+" "+item.getString(3));
				insegnanteCB.addItem(item.getInt(1)+"-"+item.getString(2)+" "+ item.getString(3) + " " + item.getString(4));
	
	
			}
		}
		catch(SQLException ex) {

			ex.printStackTrace();

		}
		
		ResultSet itemAule = InterfaceDB.GetAule();
		try {
			while(itemAule.next()) {
		
				System.out.println(itemAule.getInt(1)+"-"+itemAule.getString(2)+" "+itemAule.getString(3));
				aulaCB.addItem(itemAule.getInt(1)+"-"+itemAule.getString(2)+" "+ itemAule.getString(3));
	
	
			}
		}
		catch(SQLException ex) {

			ex.printStackTrace();

		}
		
		mainWindowPanel.add(nome);
		mainWindowPanel.add(nomeTF);
		mainWindowPanel.add(desc);
		mainWindowPanel.add(descTF);
		mainWindowPanel.add(insegnante);
		mainWindowPanel.add(insegnanteCB);
		mainWindowPanel.add(bloccoOrario);
		mainWindowPanel.add(bloccoOrarioCB);
		mainWindowPanel.add(aula);
		mainWindowPanel.add(aulaCB);

		
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
