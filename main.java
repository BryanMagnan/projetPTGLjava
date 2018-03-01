/**
 * Les imports
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) 
	{
		//Je r�cup�re lesbatiments
		List<Batiment> batiments = getListBatiments() ;
		
		// Jer�cup�re les v�hicules
		List<Vehicule> vehicules= getListVehicules() ;
		
		//Appel de la classe Fenetre
		Fenetre fen = new Fenetre(batiments, vehicules);		
	}

	private static List<Vehicule> getListVehicules() 
	{
		List<Vehicule> vehicules = new ArrayList<Vehicule>() ;
		
		try {
			// Cr�ation d'un objet de lecture
			ReadFile tp = new ReadFile() ;
			
			// Lecture du fichier
			vehicules = tp.readPlacement("colmar800m_0_20nd.ns2mobility.xml");
		}
		// Gestion des erreurs
		catch (FileNotFoundException e) {
			System.out.println("le fichier donn� est avari�") ; // mon message tout pourri (� ne pas faire)
			System.out.println(e.getMessage()) ;                // le message pour l'utilsateur
			e.printStackTrace();                                // un message pour le d�veloppeur (plut�t pour un fichier de log)
		}
		
		return vehicules ;
	}

	private static List<Batiment> getListBatiments() {
		List<Batiment> batiments = new ArrayList<Batiment>() ;
		
		int nbp = 0 ;
		try {
			// Cr�ation d'un objet de lecture
			ReadFile tr = new ReadFile() ;
			
			// Lecture du fichier
			batiments = tr.readBatiment("colmar.poly.xml");
			
			System.out.println("Found " + batiments.size() + " batiments dans le fichier");
			for (Batiment b : batiments) {
				if (b.getPointB() != null) {
					//System.out.println(b.getPointB().size() + " points dans le batiment");
					nbp += b.getPointB().size();
				}
				else
					System.out.println("Bizarre bizzare pas de points");
			}
		}
		// Gestion des erreurs
		catch (FileNotFoundException e) {
			System.out.println("le fichier donn� est avari�") ; // mon message tout pourri (� ne pas faire)
			System.out.println(e.getMessage()) ;                // le message pour l'utilsateur
			e.printStackTrace();                                // un message pour le d�veloppeur (plut�t pour un fichier de log)
		}
		
		if (nbp == 0) {
			System.out.println("Too bad :/ ...");
			System.exit(0);
		}
		
		return batiments ;
	}

}