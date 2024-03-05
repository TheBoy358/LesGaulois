package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0; //Invariant
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0; //Pré-condition
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		
		assert force < this.force; //Post-condition
    }
	
	public void sEquiper(Equipement equipement) {
		switch (equipement) {
		case CASQUE :
			nbEquipement = 1;
			System.out.println("Le soldat " + nom + " possède déjà un casque !");
			break;
		case BOUCLIER :
			nbEquipement = 1;
			System.out.println("Le soldat " + nom + " possède déjà un bouclier !");
			break;
		default :
			System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + " .");
			nbEquipement += 1;
		}
		
		if (nbEquipement == 2) {
			System.out.println("Le soldat " + nom + " possède déjà un bouclier !");
		}
	}
	
	public static void main(String[] args) {
		Romain minus;
		minus = new Romain("Minus",6);
		minus.parler("Bonjour");
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}