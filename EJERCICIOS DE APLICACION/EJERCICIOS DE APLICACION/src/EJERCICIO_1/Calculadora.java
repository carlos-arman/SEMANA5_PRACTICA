/*
 1-. El ejercicio de la calculadora de la guía 2 modificarlo de tal manera que el usuario permita seleccionar que operación 
    realizar S = Suma; R = Resta; M = Multiplicación y D = División, tomando en cuenta que no se puede dividir entre 0.
 */
package EJERCICIO_1;

import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char seleccion ;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        
        System.out.println("Seleccione la letra que corresponde a la operacion");
        System.out.println("S.-Sumar");
        System.out.println("R.-Restar");
        System.out.println("M.-Multiplicar");
        System.out.println("D.-Dividir");
        seleccion = leer.next().charAt(0);
        
        System.out.println("Ingrese el primer numero: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextInt(); 
        
        switch (seleccion){
            case 'S':
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
                
            case 'R':
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
                
            case 'M':
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 'D':
                resultado = numero1 / numero2;
                System.out.println("El resultado de la Divicion es: " + resultado);
                break;
        }
    }
}
