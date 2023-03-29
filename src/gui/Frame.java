package gui;

import gui.SidemenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
	int i = 0, j = 0;
	// SidemenuPanel sp = new SidemenuPanel(this);
	Dimension btnPrefSize = new Dimension(80, 40);
	
	JButton classe = new JButton("Classe");
    JButton insegnante = new JButton("Insegnante");
    JButton corso = new JButton("Corso");
    JTextField ricerca = new JTextField();
    JButton esci = new JButton("Esci");
    Insets margin = new Insets(10, 20, 10, 20);
	
	JPanel mainPanel = new JPanel();
	JPanel sidePanel = new JPanel();
	JPanel window = new JPanel();
	
	public Frame() {
		/* sp.setMain(mainPanel);
		sp.setSide(sidePanel);
		sp.setMinWidth(60);
		sp.setMaxWidth(100); */   
		classe.setSize(btnPrefSize);
		insegnante.setSize(btnPrefSize);
		corso.setSize(btnPrefSize);
		ricerca.setSize(btnPrefSize);
		esci.setSize(btnPrefSize);
		
		classe.setMargin(margin);
		insegnante.setMargin(margin);
		corso.setMargin(margin);
		ricerca.setMargin(margin);
		esci.setMargin(margin);
		
		mainPanel.add(classe);
		mainPanel.add(insegnante);
		mainPanel.add(corso);
		mainPanel.add(ricerca);
		mainPanel.add(esci);
		
		window.add(mainPanel);
		
		mainPanel.setLayout(new GridLayout(5, 1, 20, 20));  
		window.setLayout(new FlowLayout());  
		// window.add();
		
		this.getContentPane().add(window);
		this.setSize(400, 500);
		this.setTitle("Admin Corsi");
		this.setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
