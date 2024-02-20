package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide panoramix;
		panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		
		Gaulois asterix;
		asterix = new Gaulois("Astérix",8);
	    
		Gaulois obelix;
		obelix = new Gaulois("Obélix",25);
		
		panoramix.booster(obelix);
		
		obelix.parler("Par Bélénos, ce n'est pas juste !"); 
		
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour");
		
		Romain minus;
		minus = new Romain("Minus",6);
		
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
	}

}
