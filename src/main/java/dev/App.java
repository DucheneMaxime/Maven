package dev;

import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	/* TP 01
        String asciiArt1 = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt1);
         */
    	/* TP 02
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArt = FigletFont.convertOneLine(titre);
    	System.out.println(asciiArt);
    	*/
    	
    	//TP 03
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArt = FigletFont.convertOneLine(titre);
    	System.out.println(asciiArt);
    	// affichage de l'environnement
    	String environnement = ResourceBundle.getBundle("application").getString(
    	"environnement");
    	System.out.println("Environnement : " + environnement);
    }
}
