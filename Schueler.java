package personenVerwaltung;

public class Schueler {
	
	//klasse
	private String klasse;

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	
	//ausbildungsjahr
	private int ausbildungsjahr;

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
	
	//toString Methode
	public String toString() {
		return String.format("Klasse: %s, Ausbildungsjahr: %s", klasse, ausbildungsjahr);
	}

}
