/**
 * Class des points des bâtiments
 * @author Valentin THIERRY
 */
public class PointsB 
{
	/**
	 * Attributs
	 */
	private double pointX;
	private double pointY;
	
	/**
	 * Crée un objet Point
	 * @param pointX : coordonnées de X
	 * @param pointY : coordonnées de Y
	 */
	public PointsB(double pointX, double pointY)
	{
		this.pointX = pointX;
		this.pointY = pointY;
	}
	
	/**
	 * Permet de récupérer la valeur de la variable x
	 * @return récupère la valeur de pointX
	 */
	public int getPointX()
	{
		// Changement du type de la variable de double à int
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