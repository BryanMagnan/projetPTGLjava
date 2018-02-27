package fr.uha.drouhin.testreadfile2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lecture d'un fichier (explication technique en vue d'être utilsé dans l'échiquier)
 * @author Frédéric DROUHIN
 *
 */
public class TestReadFile {

	/**
	 * Pour retenir le nom du fichier
	 */
	private String filename = null;
	private static final Pattern p = Pattern.compile("<poly id=\\\"([0-9]+)\\\" type=\\\"([a-zA-Z]+)\\\" color=\\\"(.*)\\\" fill=\\\"([0-9])\\\" layer=\\\"(.*[0-9])\\\" shape=\\\"(.*)\\\"");


	/**
	 * Constructeur par défaut 
	 */
	public TestReadFile(){

	}

	/**
	 * Lecture d'un fichier
	 * @param filename nom du fichier à lire
	 * @throws FileNotFoundException en cas d'erreur d'ouverture
	 */
	public void read (String filename) throws FileNotFoundException {

		this.filename = filename ;

		Scanner scanner = null ; // partie déclaration 

		try {
			scanner = new Scanner(new BufferedReader(new FileReader(filename)));

			while (scanner.hasNextLine()) {
				String ligne = scanner.nextLine();
			    Matcher m = p.matcher(ligne);
			    if (m.find()) 
			    {
			        // ...then you can use group() methods.
			        System.out.println(m.group(6)); // shape
		        }
			}
		}
		finally {
			// Ne pas oublier de fermer le fichier que j'ai eu une exception ou non !
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
