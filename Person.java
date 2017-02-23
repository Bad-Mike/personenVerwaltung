package personenVerwaltung;

public class Person {
	
	//name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//vorname
	private String vorname;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	//this
	Person (String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	//toString Methode
	public String toString() {
		return String.format("Name: %s, Vorname: %s", name, vorname);
	}
}
