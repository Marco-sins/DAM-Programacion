import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i;
        double num;
        double[] v = new double[5];

        i = 0;
        try 
        {
            while (i < 5)
            {
                System.out.println("Ingresa un número");
                num = scan.nextDouble();
                v[i] = num;
                i++;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor introducido incorrecto, introduce otro valor");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Valor introducido incorrecto, introduce otro valor");
        }
        catch (IllegalStateException e)
        {
            System.out.println("Valor introducido incorrecto, introduce otro valor");
        }
        System.out.println(Arrays.toString(v));
        scan.close();
    }
}
