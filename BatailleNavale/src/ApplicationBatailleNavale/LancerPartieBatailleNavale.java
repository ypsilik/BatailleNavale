package ApplicationBatailleNavale;

public class LancerPartieBatailleNavale {

	public static void main(String[] args) {
		Tableau tableauJ1 = new Tableau();
		Tableau tableauJ2 = new Tableau();
		new PartieBatailleNavale(tableauJ1, tableauJ2).jouer();

	}

}
