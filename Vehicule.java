
import java.util.ArrayList;

public class Vehicule {
	private int num;
	private double posX;
	private double posY;
	private double posZ;
	private ArrayList<Deplacement> deplacementHist;
	
	public Vehicule(int num, double posX, double posY, double posZ, ArrayList<Deplacement>deplacementHist) 
	{
		this.num = num;
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.deplacementHist = deplacementHist;
	}
	
	//Permet de récupérer la valeur de la variable posX
	public int getPosX()
	{
		//Changement du type de la variable de double à int
		int posX = (int) this.posX;
		return posX;
	}
	
	//Permet de récupérer la valeur de la variable posY
	public int getPosY()
	{
		//Changement du type de la variable de double à int
		int posY = (int) this.posY;
		return posY;
	}
}
