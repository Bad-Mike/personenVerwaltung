package personenVerwaltung;

public class Personenverwaltung {
	public static void main(String args[]) {
		
		//input for toString
		Person person1 = new Person("Plotter", "Mike");
		Schueler schueler1 = new Schueler("it5d", 2);
		Lehrer lehrer1 = new Lehrer("Heikens", "AE");
		
		//input for default constructor
		Person person2 = new Person("Mustermann", "Max");
		Schueler schueler2 = new Schueler("it5d", 2);
		Lehrer lehrer2 = new Lehrer("Dittmer", "IT");
		
		//output toSting
		System.out.println(person1.toString());
		System.out.println(schueler1.toString());
		System.out.println(lehrer1.toString());
		
		System.out.println();
		
		//output default constructor
		System.out.println("Name: " + person2.name + " Vorname: " + person2.vorname);
		System.out.println("Klasse: " + schueler2.klasse + " Ausbildungsjahr: " + schueler2.ausbildungsjahr);
		System.out.println("Lehrer: " + lehrer2.lname + " Fach: " + lehrer2.fach);
		
	}

}
