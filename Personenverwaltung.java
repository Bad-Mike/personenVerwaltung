package personenVerwaltung;

public class Personenverwaltung {
	public static void main(String args[]) {
		
		//input for toString
		Person person1 = new Person("Plotter", "Mike");
		//Schueler schueler1 = new Schueler("IT5d", 2);
		Schueler schueler1 = new Schueler("Plotter", "Mike", "IT5d", 2);	//3. constructor in Schueler.java
		//Lehrer lehrer1 = new Lehrer("AE");
		Lehrer lehrer1 = new Lehrer("Heikens", "Elke", "AE");				//3. contructor in Lehrer.java
		
		//input without toString
		Person person2 = new Person("Mustermann", "Max");
		Schueler schueler2 = new Schueler("IT5d", 2);
		Lehrer lehrer2 = new Lehrer("IT");
		
		//input default constructor
		Person person3 = new Person();
		//wird überschrieben
		//input set- and get
		person3.setName("Schmidt");				//overwrite
		//person3.setVorname("Peter");			//Auskommentiert wird es nicht überschrieben
		Schueler schueler3 = new Schueler();
		schueler3.setName("Kahn");
		schueler3.setVorname("Jens");
		schueler3.setKlasse("IT4a");
		schueler3.setAusbildungsjahr(3);
		Lehrer lehrer3 = new Lehrer();
		
		
		//output toSting
		System.out.println("<toString method>");
		System.out.println();
		
		System.out.println(person1.toString());
		System.out.println(schueler1.toString());
		System.out.println(lehrer1.toString());
		
		//output without toString
		System.out.println();
		System.out.println();
		System.out.println("<without toString>");
		System.out.println();
		
		System.out.println("Name: " + person2.name + " Vorname: " + person2.vorname + " Kennung: " + person2.kennung());
		System.out.println("Klasse: " + schueler2.klasse + " Ausbildungsjahr: " + schueler2.ausbildungsjahr + " Kennung: " + schueler2.kennung());
		System.out.println("Fach: " + lehrer2.fach + " Kennung: " + lehrer2.kennung());
		
		//output default constructor
		System.out.println();
		System.out.println();
		System.out.println("<default constructor>");
		System.out.println("<overwrite>");
		System.out.println();
		
		System.out.println(person3);
		System.out.println(schueler3);
		System.out.println(lehrer3);
		
		
	}
	
}
