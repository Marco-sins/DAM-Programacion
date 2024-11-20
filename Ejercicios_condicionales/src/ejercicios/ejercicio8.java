package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu mes de nacimiento: ");
		String mes = scan.nextLine();
		System.out.println("Introduce tu dia de nacimiento: ");
		int dia = scan.nextInt();
		String hor = "";
		if (mes.equals("enero"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 19)
				hor = "Capricornio";
			else if (dia >= 20 && dia <= 31)
				hor = "Acuario";
		}
		else if (mes.equals("febrero"))
		{
			if (dia <= 0 || dia >= 30)
				hor = "Error";
			else if (dia >= 1 && dia <= 18)
				hor = "Acuario";
			else if (dia >= 19 && dia <= 30)
				hor = "Piscis";
		}
		else if (mes.equals("marzo"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 20)
				hor = "Piscis";
			else if (dia >= 21 && dia <= 31)
				hor = "Aries";
		}
		else if (mes.equals("abril"))
		{
			if (dia <= 0 || dia >= 31)
				hor = "Error";
			else if (dia >= 1 && dia <= 19)
				hor = "Aries";
			else if (dia >= 20 && dia <= 31)
				hor = "Tauro";
		}
		else if (mes.equals("mayo"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 20)
				hor = "Tauro";
			else if (dia >= 21 && dia <= 31)
				hor = "Géminis";
		}
		else if (mes.equals("junio"))
		{
			if (dia <= 0 || dia >= 31)
				hor = "Error";
			else if (dia >= 1 && dia <= 20)
				hor = "Géminis";
			else if (dia >= 21 && dia <= 31)
				hor = "Cáncer";
		}
		else if (mes.equals("julio"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 22)
				hor = "Cáncer";
			else if (dia >= 23 && dia <= 31)
				hor = "Leo";
		}
		else if (mes.equals("agosto"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 22)
				hor = "Leo";
			else if (dia >= 23 && dia <= 31)
				hor = "Virgo";
		}
		else if (mes.equals("septiembre"))
		{
			if (dia <= 0 || dia >= 31)
				hor = "Error";
			else if (dia >= 1 && dia <= 22)
				hor = "Virgo";
			else if (dia >= 23 && dia <= 31)
				hor = "Libra";
		}
		else if (mes.equals("octubre"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 22)
				hor = "Libra";
			else if (dia >= 23 && dia <= 31)
				hor = "Escorpio";
		}
		else if (mes.equals("noviembre"))
		{
			if (dia <= 0 || dia >= 31)
				hor = "Error";
			else if (dia >= 1 && dia <= 21)
				hor = "Escorpio";
			else if (dia >= 20 && dia <= 31)
				hor = "Sagitario";
		}
		else if (mes.equals("diciembre"))
		{
			if (dia <= 0 || dia >= 32)
				hor = "Error";
			else if (dia >= 1 && dia <= 21)
				hor = "Sagitario";
			else if (dia >= 22 && dia <= 31)
				hor = "Capricornio";
		}
		else
			hor = "Error";
		System.out.println(hor);
	}
}