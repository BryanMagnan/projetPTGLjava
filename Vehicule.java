import java.util.ArrayList;

public class Vehicule {
	private int num;
	private double posX;
	private double posY;
	private double posZ;
	private ArrayList<Deplacement> deplacementHist;
	
	public Vehicule(int num, double posX, double posY, double posZ, ArrayList<Deplacement> deplacementHist) 
	{
		this.num = num;
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.deplacementHist = new ArrayList<Deplacement>(deplacementHist);
	}
}
