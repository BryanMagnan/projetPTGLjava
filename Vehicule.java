/**
 * Les imports
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Class Vehicule
 * @author PTGL
 */
public class Vehicule {
	// Attributs
	private int num;
	private double posX;
	private double posY;
	private double posZ;
	private List<Deplacement> deplacementHist;
	
	/**
	 * Constructeur
	 * @param num
	 * @param posX
	 * @param posY
	 * @param posZ
	 * @param deplacementHist
	 */
	public Vehicule(int num, double posX, double posY, double posZ, List<Deplacement>deplacementHist) 
	{
		this.num = num;
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.deplacementHist = deplacementHist;
	}
	
	public Vehicule () 
	{
		
	}
	
	
	public int getPosX() //Permet de récupérer la valeur de la variable posX
	{
		//Changement du type de la variable de double à int
		int posX = (int) this.posX;
		return posX;
	}
	
	
	public int getPosY() //Permet de récupérer la valeur de la variable posY
	{
		//Changement du type de la variable de double à int
		int posY = (int) this.posY;
		return posY;
	}
}
