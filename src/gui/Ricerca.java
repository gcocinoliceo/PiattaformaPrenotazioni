package gui;

import javax.swing.*;

import backend.InterfaceDB;
import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Ricerca extends JPanel implements ActionListener {
	JPanel fields = new JPanel(new GridLayout(2, 2));
	JPanel btns = new JPanel(new FlowLayout());
	JPanel resultsPanel = new JPanel(new FlowLayout());
	
	JLabel insegnanti = new JLabel("Nome insegnante");
	JTextField insTF = new JTextField();
	JLabel blocco = new JLabel("Blocco Orario");
	String[] opzBO = {"-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
	JComboBox<String> bloccoOrarioCB = new JComboBox<String>(opzBO);
	
	JButton search = new JButton("Ricerca");
	JButton rtrn = new JButton("Ritorna");
	
	JLabel results = new JLabel();
	
	
	public Ricerca (JPanel mainPanel) {
			search.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String JLabelContent = "";
					if(e.getSource() == search) {
						JLabelContent = "<html>";
						if(!insTF.getText().equals("") || bloccoOrarioCB.getSelectedIndex() != 0) {

								ResultSet textToJLabel = InterfaceDB.GetCorsi(insTF.getText(), bloccoOrarioCB.getSelectedIndex());
								try {
									
									while(textToJLabel.next()) {
										JLabelContent += textToJLabel.getInt(1)+" | "+textToJLabel.getString(2)+" | "+ textToJLabel.getString(3) + " <br> ";
										
									}
									JLabelContent += "</html>";
								}
								catch(SQLException ex) {
									ex.printStackTrace();
								}
								
								results.setText(JLabelContent);
							}	
						}
					}
				}
			);
		
		fields.add(insegnanti);
		fields.add(insTF);
		fields.add(blocco);
		fields.add(bloccoOrarioCB);
		
		
		search.setPreferredSize(new Dimension(150, 30));
		rtrn.setPreferredSize(new Dimension(150, 30));
		btns.add(search);
		btns.add(rtrn);
		rtrn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(Frame.window, "1");
			}
			
		});
		
		resultsPanel.add(results);
		
		
		this.add(fields);
		this.add(btns);
		this.add(resultsPanel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
