import java.util.ArrayList;

public class Batiment 
{
	private ArrayList<PointsB> batiment;
	
	//Crée un objet Batiment avec une liste de points
	public Batiment(ArrayList<PointsB> batiment)
	{
		this.batiment = batiment;
	}
	
	//Ajoute un point à la liste des points du batiment
	public void arrayMaker(PointsB pointBatiment)
	{
		this.batiment.add(pointBatiment);
	}
}
