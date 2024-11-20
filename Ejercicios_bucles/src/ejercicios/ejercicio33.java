package ejercicios;

public class ejercicio33
{
	public static void main(String[] args)
	{
		int len;
		int i;
		int j;
		String str;
		String aux;
		char c;
		
		str = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
		System.out.println(str);
		aux = "";
		i = 1;
		j = 1;
		len = 1;
		while (len != 0)
		{
			len = str.length();
			while (i < len)
			{
				c = str.charAt(i);
				aux += c;
				i++;
			}
			System.out.println(aux);
			aux = "";
			j++;
			i = j;
			if (i != len)
				len = 1;
			else
				len = 0;
		}
		//System.out.println("Fin");
	}
}