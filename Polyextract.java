package extraction_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polyextract {
	//
	// Extraction des données de "<poly"
	//
	private static final Pattern p = Pattern.compile("<poly id=\\\"([0-9]+)\\\" type=\\\"([a-zA-Z]+)\\\" color=\\\"(.*)\\\" fill=\\\"([0-9])\\\" layer=\\\"(.*[0-9])\\\" shape=\\\"(.*)\\\"");
	public static void main (String[] args) {
	    // create matcher for pattern p and given string
		String move = "<poly id=\"46837841\" type=\"tourism\" color=\"207,245,201\" fill=\"1\" layer=\"-10.00\" shape=\"818.47,643.25 811.61,641.34 768.00,705.18 779.68,718.86 786.65,713.51 793.86,709.48 799.10,707.52 806.33,705.38 813.01,704.37 822.01,704.03 818.47,643.25\"/>" ;
	    Matcher m = p.matcher(move);

	    // if an occurrence if a pattern was found in a given string...
	    if (m.find()) {
	        // ...then you can use group() methods.
	        System.out.println(m.group(0)); // whole matched expression
	        System.out.println(m.group(1)); // id
	        System.out.println(m.group(2)); // type
	        System.out.println(m.group(3)); // color
	        System.out.println(m.group(4)); // fill
	        System.out.println(m.group(5)); // layer
	        System.out.println(m.group(6)); // shape
        	}
	}
}
