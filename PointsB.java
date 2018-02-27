
public class PointsB 
{
	private double pointX;
	private double pointY;
	
	//Crée un objet Point avec des coordonnées x et y
	public PointsB(double pointX, double pointY)
	{
		this.pointX = pointX;
		this.pointY = pointY;
	}
	
	//Permet de récupérer la valeur de la variable x
	public int getPointX()
	{
		//Changement du type de la variable de double à int
		int pointX = (int) this.pointX;
		return pointX;
	}
	
	//Permet de récupérer la valeur de la variable y
	public int getPointY()
	{
		//Changement du type de la variable de double à int
		int pointY = (int) this.pointY;
		return pointY;
	}
}
