package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertClasseGUI extends JPanel implements ActionListener {
	JPanel mainWindowPanel = new JPanel();
	JPanel mainPanelCard = Frame.mainPanelCard;
	JLabel test = new JLabel("Buttons here");
	JButton insert = new JButton("Inserisci");
	
	public InsertClasseGUI() {
		
		insert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Do nothing here, the action is handled in the main class
            }
        });
		mainWindowPanel.add(insert);
		mainWindowPanel.add(test);
		
		mainWindowPanel.setLayout(new GridLayout(2, 1, 20, 20));  
		
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
