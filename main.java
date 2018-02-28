package Boucle;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) 
	{
		//Appel de la classe Fenetre
		
		//Je récupère lesbatiments
		List<Batiment> batiments = getListBatiments() ;
		
		// Jerécupère les véhicules
		List<Vehicule> vehicules= getListVehicules() ;
		
		
		Fenetre fen = new Fenetre(batiments, vehicules);		
	}

	private static List<Vehicule> getListVehicules() {
		List<Vehicule> vehicules = new ArrayList<Vehicule>() ;
		
		Vehicule v =new Vehicule() ;
		
		vehicules.add(v) ;
		
		return vehicules ;
	}

	private static List<Batiment> getListBatiments() {
		List<Batiment> batiments = new ArrayList<Batiment>() ;
		
		//Création de l'objet Batiment avec pour attribut sa liste de points
		Batiment batiment0 = new Batiment(pbatiment0);
		
		//Création d'un objet Points qui désigne les différents points du batiments et qui a pour attributs ses coordonnées x et y
		PointsB p0b0 = new PointsB(575.04,680.88);
		PointsB p1b0 = new PointsB(577.92,687.21);
		PointsB p2b0 = new PointsB(580.50,692.88);
		PointsB p3b0 = new PointsB(596.68,685.78);
		PointsB p4b0 = new PointsB(593.41,678.58);
		PointsB p5b0 = new PointsB(589.38,680.36);
		PointsB p6b0 = new PointsB(590.19,682.19);
		PointsB p7b0 = new PointsB(588.36,682.90);
		PointsB p8b0 = new PointsB(585.49,676.31);
		PointsB p9b0 = new PointsB(575.04,680.88);
		
		//utilisation de la fonction arrayMaker pour ajouter les points à la liste des points du batiment (à utiliser pour la boucle)
		batiment0.arrayMaker(p0b0);
		batiment0.arrayMaker(p1b0);
		batiment0.arrayMaker(p2b0);
		batiment0.arrayMaker(p3b0);
		batiment0.arrayMaker(p4b0);
		batiment0.arrayMaker(p5b0);
		batiment0.arrayMaker(p6b0);
		batiment0.arrayMaker(p7b0);
		batiment0.arrayMaker(p8b0);
		batiment0.arrayMaker(p9b0);
		
		batiments.add(batiment0) ;
		
		return batiments ;
	}

}
