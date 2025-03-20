public class print {
    public static void main(String[] args)
    {
        println("buenas", 123, "ceporro");
        print("hola " + 2 + " mundo");
    }

    public static void println(Object... src)
    {
        for (Object dato : src)
            System.out.print(dato);
        System.out.print("\n");
    }

    public static void print(Object... src)
    {
        for (Object dato : src)
            System.out.print(dato);
    }
}