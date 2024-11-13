import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el num 1");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        int ns = 0;
        int elementos = 10;
        fibonaci(num1,num2,elementos);

    }//end main

    static int fibonaci(int a, int b, int elemenetos) {
        int suma = 0;
        for (int i = 0 ; i < elemenetos ;i++)
        suma = a + b;
        a = b;
        b = suma;
        System.out.println(suma);
        return suma;
    }//end fibonaci
}//end class