
public class ForBoucle {

	public static void main(String[] args) {
		int nombreMin = 1 ;
		/*
		 * Afficher les nombres de 1 � 100
		 */
//		System.out.println("Afficher les nombres de 1 � 100");
//		while (nombreMin <= 100) {
//			System.out.println(nombreMin);
//			nombreMin++;
//		}
		
		/*
		 * D�claration et affectation de la variable nombre
		 * condition
		 * traitement
		 * Inr�menter la variable 
		 * condition
		 * traitement
		 * Inr�menter la variable 
		 * condition
		 * traitement
		 * Inr�menter la variable 
		 * condition
		 */
		
		/*
		 * int nombre = 1 ;
		 * nombre <= 100;
		 * System.out.println(nombre);
		 * nombre++;
		 * nombre <= 100;
		 * System.out.println(nombre);
		 * nombre++;
		 * nombre <= 100;
		 * .....
		 */
		for (int nombre = 1; nombre <= 100; nombre = nombre + 45) {
			System.out.println(nombre);
		}
		System.out.println("Fin du traitement");

	}

}
