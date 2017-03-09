package personenVerwaltung;

public class Schueler extends Person{
	
	String klasse;
	int ausbildungsjahr;
	
	//default constructor
	Schueler() {
		this.klasse = "<keineKlasse>";
		this.ausbildungsjahr= 0;
	}
	
	//constrictor with 2 parameters
	Schueler(String klasse, int ausbildungsjahr) {
		this.klasse = klasse;
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	//consturctor für toString
	Schueler(String name, String vorname, String klasse, int ausbildungsjahr) {
		super (name, vorname);
		this.klasse = klasse;
		this.ausbildungsjahr = ausbildungsjahr;
	}

	//klasse

	/*public String getKlasse() {
		return klasse;
	}*/

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	
	//ausbildungsjahr

	/*public int getAusbildungsjahr() {
		return ausbildungsjahr;
	}*/

	public void setAusbildungsjahr(int ausbildungsjahr) {
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	public String kennung(){
		return "Schuelerkennung";
	}
	
	//toString method
	public String toString() {
		return super.toString() + " Klasse: " + klasse + " Ausbildungsjahr: " + ausbildungsjahr;
	}
}
