package Boucle;

import java.util.List;

import javax.swing.JFrame;

public class Fenetre extends JFrame
{	
	public Fenetre(List<Batiment> batiments,List<Vehicule> vehicules) 
	{
		this.setTitle("Outil de Visualisation : TEST");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Appel de la classe Dessin
		Dessin pan = new Dessin(batiments,vehicules);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
