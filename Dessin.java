
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Dessin extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		
		//Création d'un objet Déplacement avec pour attribut la date, ses coordonnées x, y et z et sa vitesse
		Deplacement depl0node0 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 11.11);
		
		//Création d'une liste des déplacements d'un véhicules
		ArrayList<Deplacement> deplNode0 = new ArrayList<Deplacement>();
		
		//Ajout du déplacement à la liste des déplacements
		deplNode0.add(depl0node0);
		
		
		//Création d'un objet Déplacement avec pour attribut la date, ses coordonnées x, y et z et sa vitesse
		Deplacement depl0node1 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 11.11);
		
		//Création d'une liste des déplacements d'un véhicules
		ArrayList<Deplacement> deplNode1 = new ArrayList<Deplacement>();
		
		//Ajout du déplacement à la liste des déplacements
		deplNode1.add(depl0node1);
		
		
		//Création d'un objet Déplacement avec pour attribut la date, ses coordonnées x, y et z et sa vitesse
		Deplacement depl0node2 = new Deplacement(0.0, 1000.0, 100.0, 1.5, 15.33);
		
		//Création d'une liste des déplacements d'un véhicules
		ArrayList<Deplacement> deplNode2 = new ArrayList<Deplacement>();
		
		//Ajout du déplacement à la liste des déplacements
		deplNode2.add(depl0node2);
		
		
		//Création de la liste de points d'un batiments
		ArrayList<PointsB> pbatiment0 = new ArrayList<PointsB>();
		
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
		
		//Création d'un objet Vehicule avec ses coordonnées x et y et son historique de déplacement
		Vehicule node0 = new Vehicule(0, 100.0, 100.0, 1.5, deplNode0);
		Vehicule node1 = new Vehicule(1, 115.0, 100.0, 1.5, deplNode1);
		Vehicule node2 = new Vehicule(2, 161.8, 100.0, 1.5, deplNode2);
		
		//dessine un rectangle à l'emplacement du véhicule
		g.drawRect(node0.getPosX(), node0.getPosY(), 10, 10);
		g.drawRect(node1.getPosX(), node1.getPosY(), 10, 10);
		g.drawRect(node2.getPosX(), node2.getPosY(), 10, 10);
		
		//Dessine les lignes une par une pour créer le batiment à partir des différents points de la liste
		g.drawLine(p0b0.getPointX(), p0b0.getPointY(), p1b0.getPointX(), p1b0.getPointY());
		g.drawLine(p1b0.getPointX(), p1b0.getPointY(), p2b0.getPointX(), p2b0.getPointY());
		g.drawLine(p2b0.getPointX(), p2b0.getPointY(), p3b0.getPointX(), p3b0.getPointY());
		g.drawLine(p3b0.getPointX(), p3b0.getPointY(), p4b0.getPointX(), p4b0.getPointY());
		g.drawLine(p4b0.getPointX(), p4b0.getPointY(), p5b0.getPointX(), p5b0.getPointY());
		g.drawLine(p5b0.getPointX(), p5b0.getPointY(), p6b0.getPointX(), p6b0.getPointY());
		g.drawLine(p6b0.getPointX(), p6b0.getPointY(), p7b0.getPointX(), p7b0.getPointY());
		g.drawLine(p7b0.getPointX(), p7b0.getPointY(), p8b0.getPointX(), p8b0.getPointY());
		g.drawLine(p8b0.getPointX(), p8b0.getPointY(), p9b0.getPointX(), p9b0.getPointY());
		g.drawLine(p9b0.getPointX(), p9b0.getPointY(), p0b0.getPointX(), p0b0.getPointY());
	}
}
