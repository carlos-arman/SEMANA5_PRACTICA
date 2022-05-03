/*
 2-. La empresa Compu Smart se dedica a la venta de equipos de computación. Vende tanto computadoras como 
dispositivos periféricos y consumibles. La empresa cuenta con un grupo de 5 vendedores a los cuales les paga la comisión 
según el rango de la venta efectuada. Si el vendedor vende de $3000 en adelante la comisión es el 10%, si vende de $1000 a 
$2999 gana el 8% y si la venta es de 1$ a $999 gana un 5%. Pero cada vendedor tiene un salario base de $300 al cual se le 
suma el valor de la comisión por ventas. Determinar el salario líquido de un vendedor según el monto de la venta realizada
tomando en cuenta que se descuenta el 10% en concepto de renta.
 */
package EJERCICIO_2;

import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        double salario;
        Scanner leer = new Scanner(System.in);
        
        Salario sal = new Salario();
        
        for(int i=1; i <=5; i++ ){
            try{
            System.out.println("Introdusca las ventas de los vendedores: "+i);
            sal.setVenta(leer.nextDouble());
            }catch(NumberFormatException ex1){
                System.out.println(ex1.getMessage());
            }
            salario = sal.salario();
            
            System.out.println("El salario es: $"+salario);
        }
        
    }
}