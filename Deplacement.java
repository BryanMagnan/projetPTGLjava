/**
 * Class déplacement
 * @author Yohan BRABAND
 */



public class Deplacement 
{
/**
 * Les attributs
 */
	private double temps;
	private double destX;
	private double destY;
	private double destZ;
	private double speed;
	
	
	/**
	 * Le constructeur
	 * @param temps
	 * @param destX
	 * @param destY
	 * @param destZ
	 * @param speed
	 */
	public Deplacement(double temps, double destX, double destY, double destZ, double speed) 
	{
		this.temps = temps;
		this.destX = destX;
		this.destY = destY;
		this.destZ = destZ;
		this.speed = speed;
	}
}