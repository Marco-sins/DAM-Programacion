package ejercicios;

public class ejercicio30
{
	public static void main(String[] args) 
	{
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		int num3 = (int) (Math.random() * 6) + 1;
		
		System.out.println(("numero 1 = " + num1 + "\nnumero 2 = " + num2 + "\nnumero 3 = " + num3));
		if (num1 == 6 && num2 == 6 && num3 == 6)
			System.out.println("Excelente");
		else if ((num1 == 6 && num2 == 6) || (num1 == 6 && num3 == 6) || (num2 == 6 && num3 == 6))
			System.out.println("Muy bien");
		else if(num1 == 6 || num2 == 6 || num3 == 6)
			System.out.println("Regular");
		else
			System.out.println("Pésimo");
	}
}