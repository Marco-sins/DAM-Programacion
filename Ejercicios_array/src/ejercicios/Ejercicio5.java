import java.util.Arrays;

public class Ejercicio5
{
    public static int[] suma(int t[], int numElementos)
    {
        int i;
        int arr[] = new int[0];

        i = 0;
        while (i + numElementos <= t.length)
        {
            arr = Arrays.copyOf(arr, i + 1);
            for (int j = numElementos - 1; j >= 0; j--)
            {
                arr[i] += t[i + j];
            }
            i++;
        }
        return (arr);
    }

    public static void main(String[] args)
    {
        int[] t = {10, 1, 5, 8, 9, 2};
        System.out.println(Arrays.toString(suma(t, 2)));
    }
}