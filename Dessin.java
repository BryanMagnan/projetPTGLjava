/**
 * Les imports
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * Class dessin dans laquelle on dessine les bâtiments ainsi que les véhicules, avec leurs coordonnées respectives
 * @author Bryan MAGNAN
 */
public class Dessin extends JPanel {

	/**
	 * Les attributs
	 */
	private List<Batiment> batiments ;
	private List<Vehicule> vehicules ;

	/**
	 * Le constructeur
	 * @param batiments : liste des bâtiments
	 * @param vehicules : liste des véhicules
	 */
	public Dessin (List<Batiment> batiments, List<Vehicule> vehicules) {
		this.batiments = batiments; 
		this.vehicules= vehicules ;
	}

	/**
	 * Dessins
	 */
	public void paint(Graphics g) {

		/**
		 * Vérifie qu'il existe un bâtiment dans la liste des bâtiments.
		 * 
		 */
		if(batiments != null) {
			for (Batiment b: batiments) { // Pour chaque bâtiment de la liste faire:
				List<PointsB>points=b.getPointB(); // la liste points prend les valeurs de tous les points du bâtiment actuel.
				if (points == null) { // Si il n'existe aucun point pour ce bâtiment:
					System.out.println("Pas de points pour le bâtiment considéré"); // Afficher ...
				} 
				else {
					// Boucle qui récupère les différentes coordonnées
					for (int i = 0 ; i < points.size() ; i = i + 1) {
						PointsB p1 = points.get(i) ;
						i ++ ;
						if (i < points.size()) {
							PointsB p2 = points.get(i) ;

							//dessine la droite
							g.drawLine(p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY());
							i--;
						}
					}
				}
			}
		}
		if(vehicules != null) { // Vérifie la présence de véhicules dans la liste
			for (Vehicule v : vehicules) {
				g.setColor(Color.RED); // Véhicules en rouge
				g.fillRect(v.getPosX(), v.getPosY(), 10, 10); // Dimensions d'un véhicule
			}
		}
		else
		{
			System.out.println("Mayday on a un problème ^^' ...");
		}
		
		
	}
}