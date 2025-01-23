package ejercicio1;

public class CifradoCesar
{
	private int n;
	private String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String down = "abcdefghijklmnopqrstuvwxyz";
	
	public CifradoCesar(int n)
	{
		this.n = n;
	}
	
	public void setNumber(int n)
	{
		this.n = n;
	}
	
	public int getNumber()
	{
		return (n);
	}
	
	private boolean upper(char c)
	{
		if (c >= 65 && c <= 90)
			return (true);
		return (false);
	}
	
	private boolean isaplha(char c)
	{
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
			return (true);
		return (false);
	}
	
	public void ft_cifrar(String str)
	{
		int i;
		int j;
		
		i = 0;
		while (i < str.length())
		{
			if (isaplha(str.charAt(i)))
			{
				if (upper(str.charAt(i)))
				{
					if (str.charAt(i) + n > 90)
						j = (str.charAt(i) - 90) + n;
					else
						j = (str.charAt(i) - 65) + n;
					System.out.print(this.up.charAt(j));
				}
				else
				{
					if (str.charAt(i) + n > 122)
						j = (str.charAt(i) - 122) + n;
					else
						j = (str.charAt(i) - 97) + n;
					System.out.print(this.up.charAt(j));
				}
			}
			else
				System.out.print(str.charAt(i));
				
			i++;
		}
	}
}