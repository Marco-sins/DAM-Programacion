package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = scan.nextInt();
		String nbr = "";
		switch (num)
		{
		case 10:
			nbr = "Diez";
			break;
		case 11:
			nbr = "Once";
			break;
		case 12:
			nbr = "Doce";
			break;
		case 13:
			nbr = "Trece";
			break;
		case 14:
			nbr = "Catorce";
			break;
		case 15:
			nbr = "Quince";
			break;
		case 16: 
			nbr = "Dieciseis";
			break;
		case 17: 
			nbr = "Diecisiete";
			break;
		case 18: 
			nbr = "Dieciocho";
			break;
		case 19: 
			nbr = "Diecinueve";
			break;
		}
		if (!(num < 20 && num > 10))
		{
			switch (num / 10)
			{
			case 2:
				nbr = "Veinte";
				break;
			case 3:
				nbr = "Treinta";
				break;
			case 4:
				nbr = "Cuarenta";
				break;
			case 5:
				nbr = "Cincuenta";
				break;
			case 6:
				nbr = "Sesenta";
				break;
			case 7:
				nbr = "Setenta";
				break;
			case 8:
				nbr = "Ochenta";
				break;
			case 9:
				nbr = "Noventa";
				break;
			}
			if (num % 10 != 0 && num > 20)
				nbr += " y ";
			switch (num % 10)
			{
			case 1:
				nbr += "uno";
				break;
			case 2:
				nbr += "dos";
				break;
			case 3:
				nbr += "tres";
				break;
			case 4:
				nbr += "cuatro";
				break;
			case 5:
				nbr += "cinco";
				break;
			case 6:
				nbr += "seis";
				break;
			case 7:
				nbr += "siete";
				break;
			case 8:
				nbr += "ocho";
				break;
			case 9:
				nbr += "nueve";
				break;
			}
			if (num == 0)
				nbr = "cero";
		}
		System.out.println(nbr);
	}
}