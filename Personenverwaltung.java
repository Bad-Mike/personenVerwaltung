package personenVerwaltung;

public class Personenverwaltung {
	public static void main(String args[]) {
		
		//input
		Person Mike = new Person("Plotek", "Mike");
		Schueler MikeSchueler = new Schueler("it5d", 2);
		Lehrer Heikens = new Lehrer("Heikens", "AE");
		
		//output
		System.out.println(Mike.toString());
		System.out.println(MikeSchueler.toString());
		System.out.println(Heikens.toString());
		
	}

}
