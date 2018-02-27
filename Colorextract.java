package extraction_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Colorextract {
	//
	// Extraire 207,245,201 de "color= 207,245,201"
	//
	private static final Pattern p = Pattern.compile("color= (.*)");
	public static void main (String[] args) {
		// create matcher for pattern p and given string
		String move = "color= 207,245,201" ;
		Matcher m = p.matcher(move);

		// if an occurrence if a pattern was found in a given string...
		if (m.find()) {
		// ...then you can use group() methods.
		System.out.println(m.group(0)); // whole matched expression
		System.out.println(m.group(1)); // color value
			    }
			}
}
