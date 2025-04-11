package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import printeamesta.Print;

public class Main {

	public static void main(String[] args)
	{
		HashMap<String, String> user = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		user.put("Marco", "cazurro");
		user.put("Jorge", "ceporro");
		user.put("Pedro", "pedro.txt");
		user.put("Nacho", "san");	
		int intentos = 3;
		String nombre;
		String pw;
		while (intentos > 0)
		{
			Print.printeamestaln("Ingresa el usuario");
			nombre = scan.nextLine();
			System.out.println("Ingrese la contraseña");
			pw = scan.nextLine();
			if (user.containsKey(nombre))
			{
				if (user.containsValue(pw))
				{
					System.out.println("Has accedido a la zona restringida");
					break;
				}
				else
					System.out.println("Tu quien ere tonto polla");
			}
			else
				System.out.println("Tu quien ere tonto polla");
			intentos--;
		}
		
	}
}
