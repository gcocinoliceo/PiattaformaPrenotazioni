package gui;

import javax.swing.*;

import gui.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertInsegnanteGUI extends JPanel implements ActionListener {
	JPanel mainPanelCard = Frame.mainPanelCard;
	JPanel mainWindowPanel = new JPanel();
	JLabel nome = new JLabel("Nome");
	JTextField nomeTF = new JTextField();
	JLabel email = new JLabel("Email");
	JTextField emailTF = new JTextField();
	JLabel materia = new JLabel("Materia");
	JTextField materiaTF = new JTextField();
	JButton insert = new JButton("Inserisci");

	
	public InsertInsegnanteGUI(JPanel mainPanel) {
		
		insert.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
	                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
	                cardLayout.show(Frame.window, "1");
	            }
        });
		mainWindowPanel.add(nome);
		mainWindowPanel.add(nomeTF);
		mainWindowPanel.add(email);
		mainWindowPanel.add(emailTF);
		mainWindowPanel.add(materia);
		mainWindowPanel.add(materiaTF);
		mainWindowPanel.add(insert);
		
		mainWindowPanel.setLayout(new GridLayout(4, 2, 20, 20));  
		
		this.add(mainWindowPanel);
		this.setSize(400, 500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
    public JButton getButton() {
        return insert;
    }
	
}
