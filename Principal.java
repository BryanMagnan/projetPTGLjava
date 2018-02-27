package fr.uha.drouhin.testreadfile2;

import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		
		try {
			// Création d'un objet de lecture
			TestReadFile tr = new TestReadFile() ;
			
			// Lecture du fichier
			tr.read("C:\\Users\\kaima\\Desktop\\Programmes\\eclipse\\colmar.poly.xml");
		}
		// Gestion des erreurs
		catch (FileNotFoundException e) {
			System.out.println("le fichier donné est avarié") ; // mon message tout pourri (à ne pas faire)
			System.out.println(e.getMessage()) ;                // le message pour l'utilsateur
			e.printStackTrace();                                // un message pour le développeur (plutôt pour un fichier de log)
		}
	}

}
