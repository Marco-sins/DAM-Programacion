package libft;

public class biblioteca
{
	public static boolean esCapicua(int num)
	{
		String str = String.valueOf(num);
		int len = str.length() - 1;
		int i = 0;
		while (len >= 0)
		{
			if (str.charAt(i) != str.charAt(len))
				return (false);
			len--;
			i++;
		}
		return (true);
	}
	
	public static boolean esPrimo(int num)
	{
		int i = 1;
		int cont = 0;
		while (i <= num)
		{
			if (num % i == 0)
				cont++;
			i++;
		}
		if (cont != 2)
			return (false);
		return (true);
	}
	
	public static int siguientePrimo(int num)
	{
		int primo = num + 1;
		int cont = 0;
		int i = 1;
		while (i <= primo)
		{
			if (primo % i == 0)
				cont++;
			i++;
			if (cont > 2)
			{
				i = 1;
				primo++;
				cont = 0;
			}
		}
		return (primo);
	}
	
	public static int digitos(int num)
	{
		String str = String.valueOf(num);
		int len = str.length();
		if (num < 0)
			return (len - 1);
		return (len);
	}
	
	public static int voltea(int num)
	{
		boolean p = false;
		if (num < 0)
		{
			num *= -1;
			p = true;
		}
		String str = String.valueOf(num);
		String st;
		if (p)
			st = "-";
		st = "";
		int len = str.length() - 1;
		while (len >= 0)
		{
			st += str.charAt(len);
			len--;
		}
		num = Integer.parseInt(st);
		return (num);
	}
	
	public static int digitoN(int num, int n)
	{
		String str = String.valueOf(num);
		int nume;
		if (num < 0)
			nume = str.charAt(n + 1) - 48;
		else
			nume = str.charAt(n) - 48;
		return (nume);
	}
	
	public static int quitaPorDetras(int num, int n)
	{
		String str = String.valueOf(num);
		String st = "";
		int len = str.length();
		int i = 0;
		if (len <= n)
			return (0);
		while (i < len - n)
		{
			st += str.charAt(i);
			i++;
		}
		num = Integer.parseInt(st);
		return (num);
	}
	
	public static int quitaPorDelante(int num, int n)
	{
		String str = String.valueOf(num);
		String st = "";
		if (num < 0)
			st += "-";
		int len = str.length() - 1;
		if (n >= len)
			return (0);
		while (n <= len)
		{
			st += str.charAt(n);
			n++;
		}
		num = Integer.parseInt(st);
		return (num);
	}
	
	public static int pegaPorDetras(int num, int digit)
	{
		String str = String.valueOf(digit);
		String st = String.valueOf(num);
		st += str;
		int n = Integer.parseInt(st);
		return (n);
	}
	
	public static int pegaPorDelante(int num, int digit)
	{
		boolean p = false;
		if (digit < 0)
		{
			System.out.println("Error");
			return (0);
		}
		String str = String.valueOf(digit);
		if (num < 0)
		{
			num *= - 1;
			p = true;
		}
		String st = String.valueOf(num);
		str += st;
		int n = Integer.parseInt(str);
		if (p)
			return (-n);
		return (n);
	}
}