/**
 * Les imports
 */
import java.util.List;
import javax.swing.JFrame;


public class Fenetre extends JFrame
{	
	public Fenetre(List<Batiment> batiments,List<Vehicule> vehicules) 
	{
		/**
		 * initialisation de la fenêtre
		 */
		this.setTitle("Outil de Visualisation : TEST");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Appel de la classe Dessin
		 */
		Dessin pan = new Dessin(batiments,vehicules);
		
		this.setContentPane(pan); // On applique les modifications faites par la class Dessin
		this.setVisible(true); // Affichage de la fenêtre
	}
}