package Display;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame{
	private Dimension TAILLE;
	private String TITLE = "Jeu sans titre 1";
	
	public Window(Dimension d){
		this.TAILLE = d;
		this.setTitle(TITLE);
		this.setPreferredSize(d);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
