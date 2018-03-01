/**
 * Class des points des b�timents
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
	 * Cr�e un objet Point
	 * @param pointX : coordonn�es de X
	 * @param pointY : coordonn�es de Y
	 */
	public PointsB(double pointX, double pointY)
	{
		this.pointX = pointX;
		this.pointY = pointY;
	}
	
	/**
	 * Permet de r�cup�rer la valeur de la variable x
	 * @return r�cup�re la valeur de pointX
	 */
	public int getPointX()
	{
		// Changement du type de la variable de double � int
		int pointX = (int) this.pointX;
		return pointX;
	}
	
	//Permet de r�cup�rer la valeur de la variable y
	public int getPointY()
	{
		//Changement du type de la variable de double � int
		int pointY = (int) this.pointY;
		return pointY;
	}
}