package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbtrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		
		for (int i = 0; trophees != null && i < trophees.length; i++, nbtrophees++) {
		    this.trophees[nbtrophees] = trophees[i];
		}
	}


	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int force) {
		effetPotion = force;
		parler("Merci Druide, je sens que ma force est " + force + " fois décuplée.");
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Astérix",8);
	    asterix.parler("Bonjour");
	    asterix.boirePotion(8);
	}
}