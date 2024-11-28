import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1
{
    private static int[] ft_menores(int[] puesto, int[] menores)
    {
        int i;
        int j;
        int n;
        int p;

        i = 0;
        p = 0;
        
        i = 0;
        while (i < puesto.length)
        {
            j = 0;
            while (j < menores.length)
            {
                if (puesto[i] == menores[j])
                {
                    if (i > 0)
                    {
                        n = puesto[i - 1];
                        puesto[i - 1] = puesto[i];
                        puesto[i] = n;
                    }
                    else
                        p = 1;
                }
                j++;
            }
            i++;
        }
        if (p == 1)
        {
            n = puesto[0];
            puesto[0] = puesto[1];
            puesto[1] = n;
        }
        System.out.println(Arrays.toString(puesto));
        return (puesto);
    }

    private static int[] ft_pagar(int[] puesto, int[] pagar)
    {
        int i;
        int j;
        int k;
        int n;

        i = 0;
        
        k = puesto.length - 1;
        i = 0;
        while (i < k)
        {
            j = 0;
            while (j < pagar.length)
            {
                if (puesto[i] == pagar[j])
                {
                    n = puesto[i];
                    for (int g = i + 1; g <= puesto.length - 1; g++)
                    {
                        puesto[g - 1] = puesto[g];
                    }
                    puesto[puesto.length - 1] = n;
                    k--;
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(puesto));
        return (puesto);
    }

    private static int[] ft_antidoping(int[] puesto, int[] doping)
    {
        int i;
        int j;
        int k;
        int n;

        i = 0;
        
        k = puesto.length - 1;
        i = 0;
        while (i < k)
        {
            j = 0;
            while (j < doping.length)
            {
                if (puesto[i] == doping[j])
                {
                    n = puesto[i];
                    for (int g = i + 1; g <= k; g++)
                    {
                        puesto[g - 1] = puesto[g];
                    }
                    puesto[k] = n;
                    k--;
                }
                j++;
            }
            i++;
        }
        puesto = Arrays.copyOf(puesto, (puesto.length - 1) - (puesto.length - 1 - k));
        System.out.println(Arrays.toString(puesto));
        return (puesto);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] puesto = new int[0];
        int[] menores = new int[0];
        int[] pagar = new int[0];
        int[] doping = new int[0];
        int i;
        int n;

        i = 0;
        System.out.println("Ingresa el dorsal del corredor");
        n = scan.nextInt();
        while (n != -1)
        {
            puesto = Arrays.copyOf(puesto, i + 1);
            puesto[i] = n;
            i++;
            System.out.println("Ingresa el dorsal del corredor");
            n = scan.nextInt();
        }
        System.out.println(Arrays.toString(puesto));
        System.out.println("Ingrese los dorsales de los menores, ingrese -1 cuando no queden mas por ingresar");
        n = scan.nextInt();
        i = 0;
        while (n != -1)
        {
            menores = Arrays.copyOf(menores, i + 1);
            menores[i] = n;
            i++;
            System.out.println("Ingrese los dorsales de los menores, ingrese -1 cuando no queden mas por ingresar");
            n = scan.nextInt();
        }
        puesto = ft_menores(puesto, menores);
        System.out.println("Ingrese el dorsal del corredor que no ha pagado, ingrese -1 cuando quiera parar");
        n = scan.nextInt();
        i = 0;
        while (n != -1)
        {
            pagar = Arrays.copyOf(pagar, i + 1);
            pagar[i] = n;
            i++;
            System.out.println("Ingrese el dorsal del corredor que no ha pagado, ingrese -1 cuando quiera parar");
            n = scan.nextInt();
        }
        puesto = ft_pagar(puesto, pagar);
        System.out.println("Ingrese el dorsal del corredor que no ha pagado, ingrese -1 cuando quiera parar");
        n = scan.nextInt();
        i = 0;
        while (n != -1)
        {
            doping = Arrays.copyOf(doping, i + 1);
            doping[i] = n;
            i++;
            System.out.println("Ingrese el dorsal del corredor que no ha pagado, ingrese -1 cuando quiera parar");
            n = scan.nextInt();
        }
        puesto = ft_antidoping(puesto, doping);
        System.out.println(Arrays.toString(puesto));
        System.out.println("Oro: " + puesto[0]);
        System.out.println("Plata: " + puesto[1]);
        System.out.println("Bronce: " + puesto[2]);
        scan.close();
    }
}