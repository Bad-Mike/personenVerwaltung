package personenVerwaltung;

public class Person {
											//1. atributes
	String name;
	String vorname;
	
	//default constructor					//2. consturctors
	Person() {
		this.name = "<keinName>";
		this.vorname = "<keinNachname>";
	}
	
	//constrictor with 2 parameters
	Person(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	//name									//3. methodes set- get-
/*	public String getName() {
		return name;
	}*/

	public void setName(String name) {
		this.name = name;
	}
	
	//vorname
/*	public String getVorname() {
		return vorname;
	}*/										//getter werden nicht benötigt da es über die toString Methode deklariert wird

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String kennung(){
		return "Personenkennung";
	}
		
	//toString method						//4. wird automatisch aufgerufen
	public String toString() {
		return String.format("Name: " + name + " Vorname: " + vorname);
	}

}
