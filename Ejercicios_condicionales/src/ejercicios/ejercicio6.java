package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce las 3 notas: ");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		int nota3 = scan.nextInt();
		int total = 0;
		String msg = "";
		if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10) && (nota3 >= 0 && nota3 <= 10))
		{
			total = (nota1 + nota2 + nota3) / 3;
			if (total >= 0 && total <= 4)
				msg = "Insuficiente";
			else if (total == 5)
				msg = "Suficiente";
			else if (total == 6)
				msg = "Bien";
			else if (total >= 7 && total <= 8)
				msg = "Notable";
			else if (total >= 9 && total <= 10)
				msg = "Sobresaliente";
			System.out.println("Su nota del boletin es: " + total + ", " + msg);
		}
		else
			System.out.println("Error");
	}
}