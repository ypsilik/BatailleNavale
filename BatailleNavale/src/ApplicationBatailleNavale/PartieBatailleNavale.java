package ApplicationBatailleNavale;

/**
 * Classe représentant une partie de bataille navale
 */
public class PartieBatailleNavale
{
	private Tableau tableauBateauxDuJoueur1;
	private Tableau tableauBateauxDuJoueur2;
	private Tableau tableauAttaqueJ1;
	private Tableau tableauAttaqueJ2;
	
	public PartieBatailleNavale(Tableau tableauJ1, Tableau tableauJ2)
	{
		this.tableauBateauxDuJoueur1 = tableauJ1;
		this.tableauBateauxDuJoueur2 = tableauJ2;
		this.tableauAttaqueJ1 = new Tableau;
		this.tableauAttaqueJ2 = new Tableau;
		
	}
/*
 * déroulement de la partie*
 * 
 * initialiser les tableaux (x4)
 * 			2 par joueurs:
 * 				 un pour les bateau placés,
 * 				 un pour les bateaux shuntés*
 *  Colonne en lettres de A à J --> Nb_Colonne=10;
 *  Ligne en chiffres de 1 à 10 --> Nb_Ligne=10;
 *  
 * placer les bateaux*
 * Définir les types de bateau
 * 		bateau 1 case(x1); 2 cases(x2); 3 cases(x2); 4 cases (x1)
 * 
 */
	

	/**
	 * Jouer la partie
	 */
	public void jouer() {
		// TODO Auto-generated method stub
		
	}
}
