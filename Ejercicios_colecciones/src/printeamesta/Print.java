package printeamesta;

public class Print {
	public static void printeamesta(Object... src)
	{
		for (Object data : src)
			System.out.print(data);
	}
	
	public static void printeamestaln(Object... src)
	{
		for (Object data : src)
			System.out.print(data);
		System.out.println();
	}
}
