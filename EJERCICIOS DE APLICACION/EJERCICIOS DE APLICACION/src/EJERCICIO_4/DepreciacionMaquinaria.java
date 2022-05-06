/*Hacer un programa que determine la depreciación aplicada a bienes basado en el costo de la maquinaria y el número de
años en que será depreciada utilizando el método de la suma de los dígitos del año. El programa deberá permitir ingresar el
costo de la maquinaria, el nombre de la máquina y el periodo de tiempo en el cual esta será depreciada. El programa
deberá imprimir el valor de la depreciación en cada año de uso de la maquinaria.
Para el método de la suma de los dígitos del año para el cálculo de la Depreciación de Bienes, la fórmula que se aplica es: (Vida
Útil/Suma Dígitos)*Valor Activo
Donde se tiene que: Suma de los dígitos es igual a (V(V+1))/2 donde V es la vida útil del activo.
Ahora determinemos el factor. Supongamos una máquina de producción cuyo valor es de
$30,000.00. A. (5(5+1))/2 B. (5*6)/2 = 15 Luego C. 5/15 = 0.3333
Es decir que para el primer año, la depreciación será igual al 33.333% del valor del activo.
(30,000.00 * 33.3333% = 10,000.00)
Para el segundo año: 4/15 = 0.2666
Es decir que para el segundo año la depreciación corresponde al 26.666% del valor del activo
(30,000.000 * 26,666% = 8,000.00)
Para el tercer año: 3/15 = 0.2
Quiere decir entonces que la depreciación para el tercer año corresponderá al 20 del valor del activo. (30,000.00 * 20% =
6,000.00)*/

package EJERCICIO_4;


import java.util.Scanner;


public class DepreciacionMaquinaria {

     public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);  

         String nombre;
         int periodoDT;
         double vidaUT;
         double costo;
         double RvidaUT;
         int VFT = 0;
         double Depreciacion;
         double Valor;

         System.out.println("Ingrese el costo de la maquinaria");
         costo =  leer.nextDouble();

         System.out.println("Ingrese el nombre de la maquinaria");
         nombre  = leer.next();

         System.out.println("Ingrese el periodo de tiempo que la maquina sera depreciada (años)");
         periodoDT =  leer.nextInt();

          System.out.println("Ingrese la vida util de la maquina");
         vidaUT =  leer.nextInt();

         RvidaUT =  (vidaUT*(vidaUT + 1))/2;


         for (int i = 0; i<=periodoDT; i++){

             VFT = periodoDT - i;
             Depreciacion = VFT/RvidaUT;
             Valor = costo * Depreciacion;

             System.out.println("El valor de la depreciacion en el año " +i+": " + Valor);
         }

     }
}
