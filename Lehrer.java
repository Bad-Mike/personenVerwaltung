package personenVerwaltung;

public class Lehrer {
	
	//lname
	private String lname;

	public String getlName() {
		return lname;
	}

	public void setName(String lname) {
		this.lname = lname;
	}
		
	//fach
	private String fach;

	public String getFach() {
		return fach;
	}

	public void setFach(String fach) {
		this.fach = fach;
	}
	
	//this
	Lehrer (String lname, String fach) {
		this.lname = lname;
		this.fach = fach;
	}
	
	//toString Methode
	public String toString() {
		return String.format("Lehrer: %s, Fach: %s", lname, fach);
	}

}