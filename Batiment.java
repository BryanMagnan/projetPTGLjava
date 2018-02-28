package Boucle;

import java.util.ArrayList;
import java.util.List;

public class Batiment 
{
	private List<PointsB> batiment;
	
	//Crée un objet Batiment avec une liste de points
	public Batiment(List<PointsB> batiment)
	{
		this.batiment = batiment;
	}
	
	//Ajoute un point à la liste des points du batiment
	public void arrayMaker(PointsB pointBatiment)
	{
		this.batiment.add(pointBatiment);
	}

	public List<PointsB> getPointB() {
		return batiment;
	}
}
