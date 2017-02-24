package personenVerwaltung;

public class Schueler {
	
	//default constructor
	Schueler() { }
	
	//klasse
	public String klasse;

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	
	//ausbildungsjahr
	public int ausbildungsjahr;

	public int getAusbildungsjahr() {
		return ausbildungsjahr;
	}

	public void setAusbildungsjahr(int ausbildungsjahr) {
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	//this
	Schueler (String klasse, int ausbildungsjahr) {
		this.klasse = klasse;
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	//toString method
	public String toString() {
		return String.format("Klasse: %s, Ausbildungsjahr: %s", klasse, ausbildungsjahr);
	}

}
