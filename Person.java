package personenVerwaltung;

public class Person {
	
	//default constructor
	Person() { }
	
	//name
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//vorname
	public String vorname;

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
	
	//toString method
	public String toString() {
		return String.format("Name: %s, Vorname: %s", name, vorname);
	}

}
