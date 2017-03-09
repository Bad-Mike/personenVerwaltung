package personenVerwaltung;

public class Lehrer extends Person{
	
	String fach;

	//default constructor
	Lehrer() {
		this.fach = "<keinFach>";
	}
	
	//constrictor with parameter
	Lehrer(String fach) {
		this.fach = fach;
	}
	
	//constructor for toString
	Lehrer(String name, String vorname, String fach) {
		super (name, vorname);
		this.fach = fach;
	}
	
	//fach
	/*public String getFach() {
		return fach;
	}*/

	public void setFach(String fach) {
		this.fach = fach;
	}
	
	public String kennung(){
		return "Lehrerkennung";
	}
	
	//toString method
	public String toString() {
		return super.toString() + " Fach: " + fach;
	}

}
