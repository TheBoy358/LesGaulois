package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random potion = new Random();
			effetPotionMax = potion.nextInt(6)+5;
		
		if (effetPotionMax > 7) {
			parler("J'ai préparé une super potion de force " + effetPotionMax + ".");
		}
		
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + effetPotionMax + ".");
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		
		else {
			gaulois.boirePotion(effetPotionMax);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix;
		panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		Gaulois asterix = new Gaulois("Astérix",8);
		panoramix.booster(asterix);
	}
}
