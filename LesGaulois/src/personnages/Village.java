package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    
    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
   }
    
    public void setChef(Chef chef) {
        this.chef = chef;
   }
    
    public String getNom() {
        return nom;
   }
    
    public void ajouterHabitant(Gaulois gaulois) {
	   this.villageois[this.nbVillageois] = gaulois;
	   this.nbVillageois += 1;
   }
   
    public Gaulois trouverHabitant(int a) {
	   return villageois[a];
   }

    public static void main(String[] args) {
	    Village village;
	    village = new Village("Village des Irréductibles", 30);
	    Gaulois gaulois = village.trouverHabitant(30);
	   
	    Chef abraracourcix;
	    abraracourcix = new Chef("Abraracourcix", 6, village);
	   
	    Gaulois asterix;
	    asterix = new Gaulois("Astérix",8);
   }
}