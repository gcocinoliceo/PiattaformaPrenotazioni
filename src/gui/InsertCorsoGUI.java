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
	
	JLabel piano = new JLabel("Nome");
	JTextField pianoTF = new JTextField();
	JLabel capacita = new JLabel("Descrizione");
	JTextField capacitaTF = new JTextField();
	JLabel bloccoOrario = new JLabel("bloccoOrario");
	JLabel insegnante = new JLabel("Insegnante"); // COMBO BOX \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/	
	 String[] items = {};
     JComboBox<String> insegnanteCB = new JComboBox<>(items);
     
     int[] opzBO = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
     JComboBox<Integer> bloccoOrarioCB = new JComboBox<Integer>(); // use opzBO
	
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
		
		ResultSet item = InterfaceDB.GetInsegnanti();
		try {
			while(item.next()) {
		
				System.out.println(item.getInt(1)+"-"+item.getString(2)+" "+item.getString(3));
				insegnanteCB.addItem(item.getInt(1)+"-"+item.getString(2)+" "+ item.getString(3) + " " + item.getString(4));
	
	
			}
		}catch(SQLException ex) {

			ex.printStackTrace();

		}
		
		mainWindowPanel.add(piano);
		mainWindowPanel.add(pianoTF);
		mainWindowPanel.add(capacita);
		mainWindowPanel.add(capacitaTF);
		mainWindowPanel.add(insegnante);
		mainWindowPanel.add(insegnanteCB);
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
