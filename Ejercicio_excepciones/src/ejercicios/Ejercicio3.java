package ejercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Ejercicio3 
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
        double[] v = new double[5];
        int i;
        
        i = 0;
        while (i < 5)
        {
        	try
        	{
        		System.out.println("Introduce un numero");
        		v[i] = scan.nextDouble();
        		i++;
        	}
        	catch (InputMismatchException e)
        	{
        		System.out.println("No has introducido un numero");
        		scan = new Scanner(System.in);
        	}
        }
        System.out.println(Arrays.toString(v));
        scan.close();
    }
}
