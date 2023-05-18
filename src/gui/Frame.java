package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
	int i = 0, j = 0;
	
	JPanel mainPanel = new JPanel();
	public static JPanel window;
	
	public static JPanel mainPanelCard = new JPanel();
	//InsertInsegnanteGUI insegnantePanelCard = new InsertInsegnanteGUI(window);

	Dimension btnPrefSize = new Dimension(80, 40);
	Insets margin = new Insets(10, 20, 10, 20);
	
	JButton aula = new JButton("aula");
    JButton insegnante = new JButton("Insegnante");
    JButton corso = new JButton("Corso");
    JButton ricerca = new JButton("Ricerca");
    JButton esci = new JButton("Esci");

	
	CardLayout cardLayout;
	InsertInsegnanteGUI insegnantePanelCard;
	InsertAulaGUI aulaPanelCard;
	InsertCorsoGUI corsoPanelCard;
	Ricerca ricercaPanelCard;
	
	public Frame() {
		
		cardLayout = new CardLayout();
		window = new JPanel(cardLayout);
		insegnantePanelCard = new InsertInsegnanteGUI(window);
		aulaPanelCard = new InsertAulaGUI(window);
		corsoPanelCard = new InsertCorsoGUI(window);
		ricercaPanelCard = new Ricerca(window);
		
		window.setLayout(new CardLayout());

		window.add(mainPanelCard, "1");
		window.add(aulaPanelCard, "2");
		window.add(insegnantePanelCard, "3");
		window.add(corsoPanelCard, "4");
		window.add(ricercaPanelCard, "5");

	    
	    CardLayout cl = (CardLayout) (window.getLayout());
        cl.show(window, "1");
		

		aula.setSize(btnPrefSize);
		insegnante.setSize(btnPrefSize);
		corso.setSize(btnPrefSize);
		ricerca.setSize(btnPrefSize);
		esci.setSize(btnPrefSize);
		
		aula.setMargin(margin);
		insegnante.setMargin(margin);
		corso.setMargin(margin);
		ricerca.setMargin(margin);
		esci.setMargin(margin);
		
		aula.addActionListener(this);
		insegnante.addActionListener(this);
		corso.addActionListener(this);
		ricerca.addActionListener(this);
		esci.addActionListener(this);
		
		mainPanel.add(aula);
		mainPanel.add(insegnante);
		mainPanel.add(corso);
		mainPanel.add(ricerca);
		mainPanel.add(esci);
		
		mainPanelCard.add(mainPanel);
		
		//window.add(mainPanelCard);
		
		
		mainPanel.setLayout(new GridLayout(5, 1, 20, 20));  
		//window.setLayout(new FlowLayout());  
		// window.add();
		
		this.getContentPane().add(window);
		this.setSize(400, 500);
		this.setTitle("Admin Corsi");
		this.setVisible(true);
	}
	
	/*public static void goHome() {
		cl.show(this.getContentPane(), "1");
	}*/

	 /*  public static void showCard(String key) {
		      cl.show(mainPanelCard, key);
		   } */
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) (window.getLayout());
		if(e.getSource() == aula) {
	        cl.show(window, "2");
		} 
		else if (e.getSource() == insegnante) {
			cl.show(window, "3");
		} 
		else if (e.getSource() == corso) {
			cl.show(window, "4");
		}
		else if (e.getSource() == ricerca) {
			cl.show(window, "5");
		}

	    else if ( e.getSource() == aulaPanelCard.insert) {
			cardLayout.show(window, "mainPanelCard");
		} 
	    else if (e.getSource() == corsoPanelCard.insert) {
			cardLayout.show(window, "mainPanelCard");
		} 
	
	}
}
