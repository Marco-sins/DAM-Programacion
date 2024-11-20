package libft;

public class main
{
	public static void main(String[] args)
	{
		System.out.println("1. capicua");
		System.out.println(biblioteca.esCapicua(1221));
		System.out.println(biblioteca.esCapicua(1121));
		
		System.out.println("2. primo");
		System.out.println(biblioteca.esPrimo(17));
		System.out.println(biblioteca.esPrimo(20));
		
		System.out.println("3. siguiente primo");
		System.out.println(biblioteca.siguientePrimo(17));
		System.out.println(biblioteca.siguientePrimo(20));
		
		System.out.println("4. digitos");
		System.out.println(biblioteca.digitos(1221));
		System.out.println(biblioteca.digitos(1121343274));
		
		System.out.println("5. voltea");
		System.out.println(biblioteca.voltea(-1221));
		System.out.println(biblioteca.voltea(12345));
		
		System.out.println("6. digitoN");
		System.out.println(biblioteca.digitoN(123456789, 5));
		System.out.println(biblioteca.digitoN(987654321, 2));
		
		System.out.println("7. quita por detras");
		System.out.println(biblioteca.quitaPorDetras(56789, 2));
		System.out.println(biblioteca.quitaPorDetras(54321, 5));
		
		System.out.println("8. quita por delante");
		System.out.println(biblioteca.quitaPorDelante(56789, 2));
		System.out.println(biblioteca.quitaPorDelante(54321, 5));
		
		System.out.println("9. pega por detras");
		System.out.println(biblioteca.pegaPorDetras(56789, 2));
		System.out.println(biblioteca.pegaPorDetras(54321, 5));
		
		System.out.println("10. pega por delante");
		System.out.println(biblioteca.pegaPorDelante(56789, 2));
		System.out.println(biblioteca.pegaPorDelante(-54321, 5));
		System.out.println(biblioteca.pegaPorDelante(54321, -5));
	}
}