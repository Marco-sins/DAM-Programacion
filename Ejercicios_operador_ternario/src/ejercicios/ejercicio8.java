package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuántos años llevas en la empresa?");
		int años = scan.nextInt();
		System.out.println("¿Cúanto gana al mes?");
		int sal = scan.nextInt();
		boolean mas10 = años > 10 ? true : false;
		boolean entre10y5 = años <= 10 && años >= 5 ? true : false;
		double total = mas10 ? ((sal +(sal * 0.20)) * 12) : entre10y5 ? ((sal +(sal * 0.10)) * 12) : (sal * 12);
		System.out.println("Su salario total al año es: " + total);
	}
}