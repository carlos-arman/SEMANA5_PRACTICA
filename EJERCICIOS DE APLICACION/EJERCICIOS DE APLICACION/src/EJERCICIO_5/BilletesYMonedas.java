
import java.util.Scanner;

/* Una agencia de llamadas necesita saber el precio por las llamadas telefónicas realizadas por sus clientes y así poder
calcular el monto a pagar. Para ello se solicita realizar un programa en Java que determine el monto a pagar por una
llamada telefónica y que luego diga la cantidad de billetes y monedas a pagar por el cliente teniendo en cuenta lo siguiente:
Una llamada que dura hasta 3 minutos tiene un costo de 20 centavos, por cada minuto adicional que dura la llamada
se le sumará un monto de 0.5 centavos adicionales, por lo tanto se debe leer el tiempo de la llamada.
El programa deberá de imprimir el número de billetes y de monedas que el usuario debe de pagar por el servicio de la llamada
realizada. Por ejemplo si el usuario tiene que pagar $15.50 
el programa deberá de imprimir lo siguiente: 1 billete de diez dólares, un billete de cinco dólares y dos monedas de
veinticinco centavos.
Monedas: 1, 5,10 y 25 centavos
Billetes: 1, 5, 10, 20 dólares
Considere que debe darse la menor cantidad de billetes y monedas posibles.  */
public class BilletesYMonedas {
    public static void main(String[] args) {
        
    
         Scanner leer = new Scanner (System.in);  
         double Cantidad;
        
          System.out.println("Introduzca los minutos de la llamada");
          Cantidad = leer.nextDouble();
        
    int billeteCien = 0;
    int billeteCincuenta = 0;
    int billeteVeinte = 0;
    int billeteDiez = 0;
    int billeteCinco = 0;
    int billeteUno = 0;
    int monedaVeinticinco = 0;
    int monedaDiez = 0;
    int monedaCinco = 0;
    int monedaUno = 0;
    
     if (Cantidad <= 3){
         
         Cantidad = Cantidad * 0.067;
             System.out.println("La cantidad a pagar es: ");
         }
     if (Cantidad >=3){
         
         double minutoA = 0.5;
        
             
         Cantidad =minutoA *(Cantidad - 3)+ Cantidad * 0.067;
          System.out.println("La cantidad a pagar es: "); 
          
     }  
      
			if( (Cantidad  >= 20) )
			{
				billeteVeinte = ((int)Cantidad  / 20);
				Cantidad  = Cantidad  - (billeteVeinte * 20);
                                System.out.println(+billeteVeinte+" Billete/s de 20");

			}
			if( (Cantidad  >= 10) )
			{
				billeteDiez = ((int)Cantidad  / 10);
				Cantidad  = Cantidad  - (billeteDiez * 10);
                                System.out.println(+billeteDiez+" Billete/s de 10");

			}
			if( (Cantidad  >= 5) )
			{
				billeteCinco = ((int)Cantidad  / 5);
				Cantidad  = Cantidad  - (billeteCinco * 5);
                                System.out.println(+billeteCinco+" Billete/s de 5");

			}
			if( (Cantidad  >= 1) )
			{
				billeteUno = ((int)Cantidad  / 1);
				Cantidad  = Cantidad  - (billeteUno * 1);
                                System.out.println(+billeteUno+" Billete/s de 1");

			}
			if( (Cantidad  >= 0.5) )
			{
				monedaVeinticinco = (int)(Cantidad  / 0.25);
				Cantidad  = Cantidad  - (double)(monedaVeinticinco * 0.25);
                                System.out.println(+monedaVeinticinco+" Moneda/s de 25");

			}
			if( (Cantidad  >= 0.1) )
			{
				monedaDiez = (int)(Cantidad  / 0.10);
				Cantidad  = Cantidad  - (double)(monedaDiez * 0.10);
                                System.out.println(+monedaDiez+" Moneda/s de 10");

			}
                        if( (Cantidad  >= 0.05) )
			{
				monedaCinco = (int)(Cantidad  / 0.05);
				Cantidad  = Cantidad  - (double)(monedaCinco * 0.05);
                                System.out.println(+ monedaCinco+" Moneda/s de 5");

			}
			if( (Cantidad  >= 0.01) )
			{
				monedaUno = (int)Math.round(Cantidad  / 0.01);
				Cantidad  = Cantidad  - (double)(monedaUno * 0.01);
                                System.out.println(+monedaUno+" Moneda/s de 1");

			}
                        
        
 }
}
