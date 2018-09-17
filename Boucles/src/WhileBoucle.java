
public class WhileBoucle {

	public static void main(String[] args) {
		
		/*
		 * Boucle WHILE 
		 * while(condition){
		 * 		traitement;
		 * }
		 */
		int a = 10 ;
		System.out.println("la variable a = " + a);
		
		// ajouter 1 � la variable a
		a = a + 1;
		System.out.println("la variable a = " + a);
		
		// ajouter 1 � la variable a
		// c'est une simplification de a = a + 1;
		a++;
		System.out.println("la variable a = " + a);
		
		// ON retir & a la variable a
		// c'est une simplification de a = a - 1;
		a--;
		System.out.println(a);
		// tant que a est sup�rieur � 2 on ex�cute ce qui est entre les {}
		while (a > 2) {
			System.out.println("la variable a = " + a );
			System.out.println("la variable a est > 2 ");
			a--;
		}
		
		// A la sortie de la boucle pr�cedante la variable a vaut 2
		// 2 <0 est une condition fausse donc on �xecute pas le traitement entre les {} de la boucle
		while(a < 0) {
			System.out.println("La variable a est < 0");
		}
		
		
		
		System.out.println(a);		
		// a = 2 
		// 2 > 5 est une condition fausse donc on �xecute pas le traitement entre les {} de la boucle
		while (a > 5) {
			System.out.println(a);
		}
		
		System.out.println("Fin");
	}
}