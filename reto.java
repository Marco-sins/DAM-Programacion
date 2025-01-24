import java.util.Scanner;

public class reto {
    public static void main(String[] args)
    {
        int lvl;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nivel 1-5");
        lvl = scan.nextInt();

        if (lvl == 1)
        {
            int a,b,p;

            for (int i = 0; i < 6; i++)
            {
                a = (int) (Math.random() * 50 + 1);
                b = (int) (Math.random() * 50 + 1);
                p = (int) (Math.random() * 2 + 1);

                if (p == 1)
                    System.out.println(a + " + " + b + " = " + (a + b));
                else
                    System.out.println(a + " - " + b + " = " + (a - b));
            }
        }
        else if (lvl == 2)
        {
            int a,b;

            for (int i = 0; i < 6; i++)
            {
                a = (int) (Math.random() * 20 + 1);
                b = (int) (Math.random() * 20 + 1);

                System.out.println(a + " * " + b + " = " + (a * b));
            }
        }
        else if (lvl == 3)
        {
            int a,b;

            for (int i = 0; i < 6; i++)
            {
                a = (int) (Math.random() * 20 + 1);
                b = (int) (Math.random() * 20 + 1);

                System.out.println(a + " / " + b + " = " + (a / b) + " resto = " + (a % b));
            }
        }
        else if (lvl == 4)
        {
            int a,b,c,p;

            for (int i = 0; i < 6; i++)
            {
                a = (int) (Math.random() * 20 + 1);
                b = (int) (Math.random() * 20 + 1);
                c = (int) (Math.random() * 50 + 1);
                p = (int) (Math.random() * 2 + 1);

                if (p == 1)
                    System.out.println(a + " * " + b + " + " + c + " = " + ((a * b) + c));
                else
                    System.out.println(a + " * " + b + " - " + c + " = " + ((a * b) - c));
            }
        }
        else if (lvl == 5)
        {
            int a,b,c;

            for (int i = 0; i < 6; i++)
            {
                a = (int) (Math.random() * 20 + 1);
                b = (int) (Math.random() * 20 + 1);
                c = (int) (Math.random() * 20 + 1);

                System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
            }
        }
        scan.close();
    }
}
