package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix;
		asterix = new Gaulois("Astérix",8);
	    asterix.parler("Bonjour à tous");
	    
		Romain minus;
		minus = new Romain("Minus",5);
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
