package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
	int i = 0, j = 0;
	// SidemenuPanel sp = new SidemenuPanel(this);
  //  CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
	
	JPanel mainPanel = new JPanel();
	JPanel classePanel = new JPanel();
	public static JPanel window;
	
	public static JPanel mainPanelCard = new JPanel();
	InsertClasseGUI classPanelCard = new InsertClasseGUI();
	//InsertInsegnanteGUI insegnantePanelCard = new InsertInsegnanteGUI(window);

	Dimension btnPrefSize = new Dimension(80, 40);
	Insets margin = new Insets(10, 20, 10, 20);
	
	JButton classe = new JButton("Classe");
    JButton insegnante = new JButton("Insegnante");
    JButton corso = new JButton("Corso");
    JTextField ricerca = new JTextField();
    JButton esci = new JButton("Esci");

	
	CardLayout cardLayout;
	InsertInsegnanteGUI insegnantePanelCard;
	
	public Frame() {
		
		cardLayout = new CardLayout();
		window = new JPanel(cardLayout);
		insegnantePanelCard = new InsertInsegnanteGUI(window);
		
		window.setLayout(new CardLayout());

		window.add(mainPanelCard, "1");
		window.add(classPanelCard, "2");
		window.add(insegnantePanelCard, "3");
	    
	    CardLayout cl = (CardLayout) (window.getLayout());
        cl.show(window, "1");
		
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
		
		classe.addActionListener(this);
		insegnante.addActionListener(this);
		corso.addActionListener(this);
		ricerca.addActionListener(this);
		esci.addActionListener(this);
		
		mainPanel.add(classe);
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
		if(e.getSource() == classe) {
	        cl.show(window, "2");
		} else if (e.getSource() == classPanelCard.getButton()) {
            // Switch back to the original panel
            cardLayout.show(window, "mainPanelCard");
        } else if (e.getSource() == insegnante) {
			cl.show(window, "3");
		} else if (e.getSource() == insegnantePanelCard.getButton()) {
            // Switch back to the original panel
            cardLayout.show(window, "mainPanelCard");
		}
	}
}
