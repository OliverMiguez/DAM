/**
 * Practica de recursividad Fibonaci
 */
public class recursividad {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String []args){
        recursiva(0,1);
        System.out.println("ACABE");
    }//end main

    /**
     * Funcion para calcular la recursividad
     */
    static void recursiva(int a, int b){
        int suma = a + b;

        System.out.println(suma);
        a = b;
        b = suma;
        if(suma<10){//compureba si las letras que tiene msg supera los diez valores , para que el ide no explote
            recursiva(a,b);
        }//end if

    }//end recursiva


}//end class
