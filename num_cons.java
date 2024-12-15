import java.util.Scanner;

public class num_cons
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la suma de los numeros consecutivos:");
        int n = scan.nextInt();
        System.out.println("Ingrese la cantidad de numeros consecutivos:");
        int i = scan.nextInt();

        if (n % i != 0)
        {
            System.out.println("No se puede hacer la operacion");
            return;
        }
        int cant = n / i;
        int sum = i / 2;
        if (i % 2 == 0)
        {
            while (i > 0)
            {
                System.out.println((cant + sum));
                i--;
                sum--;
                if (sum == 0)
                    sum--;
            }
        }
        else
        {
            while (i > 0)
            {
                System.out.println((cant + sum));
                i--;
                sum--;
            }
        }
    }
}