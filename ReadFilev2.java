import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringTokenizer;

/**
 * Lecture d'un fichier (explication technique en vue d'être utilsé dans l'échiquier)
 * @base Frédéric DROUHIN
 *
 */
public class ReadFile {

	/**
	 * Pour retenir le nom du fichier
	 */
	private String filename = null;
	private static final Pattern p = Pattern.compile("<poly id=\\\"([0-9]+)\\\" type=\\\"([a-zA-Z]+)\\\" color=\\\"(.*)\\\" fill=\\\"([0-9])\\\" layer=\\\"(.*[0-9])\\\" shape=\\\"(.*)\\\"");
	private static final Pattern k = Pattern.compile("([0-9]+\\.[0-9]+)\\,([0-9]+\\.[0-9]+)");
	private static final Pattern l = Pattern.compile("\\$node\\(([0-9]+.?[0-9])\\)\\s+set([a-zA-Z])([0-9]+.?[0-9])");


	/**
	 * Constructeur par défaut 
	 */
	public ReadFile(){

	}

	/**
	 * Lecture d'un fichier
	 * @param filename nom du fichier à lire
	 * @throws FileNotFoundException en cas d'erreur d'ouverture
	 */
	public ArrayList<Batiment> readBatiment (String filename) throws FileNotFoundException {

		this.filename = filename ;
		ArrayList<Batiment> listeBatiment = new ArrayList<Batiment>();

		Scanner scanner = null ; // partie déclaration 

		try {
			scanner = new Scanner(new BufferedReader(new FileReader(filename)));

			while (scanner.hasNextLine()) {
				String ligne = scanner.nextLine();
			    Matcher m = p.matcher(ligne);
			    if (m.find()) 
			    {
			    	ArrayList<PointsB> pointsBatiment = new ArrayList<PointsB>();
			    	Batiment batiment = new Batiment(pointsBatiment);
			    	listeBatiment.add(batiment);
			    	String line = (m.group(6));
			    	StringTokenizer st = new StringTokenizer(line, " ");

			        while (st.hasMoreTokens()) 
			        {
			          String token = (st.nextToken());
			          Matcher n = k.matcher(token);

			  	    	// if an occurrence if a pattern was found in a given string...
			  	    	if (n.find()) 
			  	    	{
			  	    		// ...then you can use group() methods.
			  	    		double posX = Double.parseDouble(n.group(1));
			  	    		double posY = Double.parseDouble(n.group(2));
			  	    		PointsB point = new PointsB(posX, posY);
			  	    		pointsBatiment.add(point);
			         	}
			        }
		        }
			}
		}
		finally {
			// Ne pas oublier de fermer le fichier que j'ai eu une exception ou non !
			if (scanner != null) {
				scanner.close();
			}
		}
		return listeBatiment;
	}
	
    public ArrayList<Vehicule> readPlacement (String filename) throws FileNotFoundException { 
        this.filename = filename ;
        ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();

        // scanne le fichier
        Scanner scanner = null ; // initialisation du scanner


        try {
            scanner = new Scanner(new BufferedReader(new FileReader(filename))); // donne le rôle de scanner
            int i = 0;
            int num = 0;
            double posX = 0;
            double posY = 0;

            while (scanner.hasNextLine()) { // tant qu'il y a une nouvelle ligne, faire:
                String ligne = scanner.nextLine(); // Enregistre cette ligne dans "ligne"
                Matcher o = l.matcher(ligne); // comparaison
                if (o.find()) // Si on trouve quelque chose:
                {
                    i++;
                    if(i == 1) 
                    {
                    	num = Integer.parseInt(o.group(1));
                    	posX = Double.parseDouble(o.group(3));
                    }
                    else if(i == 2)
                    {
                    	posY = Double.parseDouble(o.group(3));
                    }
                    else if(i == 3)
                    {
                    	i = 0;
                    	ArrayList<Deplacement> deplacementHist = new ArrayList<Deplacement>();
                    	Vehicule vehicule = new Vehicule(num, posX, posY, 1.5, deplacementHist);
                    	listeVehicule.add(vehicule);
                    }
                    else 
                    {
                    	System.out.println("Erreur 404");
                    }
                }
            }
        }
        finally {
            // Ne pas oublier de fermer le fichier que j'ai eu une exception ou non !
            if (scanner != null) {
                scanner.close();
            }
        }
        return listeVehicule;
    }
}
