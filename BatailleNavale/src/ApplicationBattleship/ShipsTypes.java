package ApplicationBattleship;

//import javax.swing.Spring;
/**
 * enumeration of ships types
 * @author CAYRE Laure and LAURENT Maud
 *
 */
public enum ShipsTypes {
	
		/**
		 * ship type use 5 cases
		 */
		AIRCRAFT_CARRIER,
		/**
		 * ship type use 4 cases
		 */
		CRUISER,
		/**
		 * ship type use 3 cases
		 */
		SUBMARINEn1,
		SUBMARINEn2,
		/**
		 * ship type use 2 cases
		 */
		TORPEDO;
		
		public String toString(){
			if (this == AIRCRAFT_CARRIER) return "5";
			if (this == CRUISER) return "4";
			if (this == SUBMARINEn1) return "$";
			if (this == SUBMARINEn2) return "S";
			else return "2";
		}
	}
