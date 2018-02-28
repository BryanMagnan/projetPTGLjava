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

}
