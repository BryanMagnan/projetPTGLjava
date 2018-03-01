/**
 * Les imports
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * Class dessin dans laquelle on dessine les b�timents ainsi que les v�hicules, avec leurs coordonn�es respectives
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
	 * @param batiments : liste des b�timents
	 * @param vehicules : liste des v�hicules
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
		 * V�rifie qu'il existe un b�timent dans la liste des b�timents.
		 * 
		 */
		if(batiments != null) {
			for (Batiment b: batiments) { // Pour chaque b�timent de la liste faire:
				List<PointsB>points=b.getPointB(); // la liste points prend les valeurs de tous les points du b�timent actuel.
				if (points == null) { // Si il n'existe aucun point pour ce b�timent:
					System.out.println("Pas de points pour le b�timent consid�r�"); // Afficher ...
				} 
				else {
					// Boucle qui r�cup�re les diff�rentes coordonn�es
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
		if(vehicules != null) { // V�rifie la pr�sence de v�hicules dans la liste
			for (Vehicule v : vehicules) {
				g.setColor(Color.RED); // V�hicules en rouge
				g.fillRect(v.getPosX(), v.getPosY(), 10, 10); // Dimensions d'un v�hicule
			}
		}
		else
		{
			System.out.println("Mayday on a un probl�me ^^' ...");
		}
		
		
	}
}