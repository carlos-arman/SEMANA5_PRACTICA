import java.util.Scanner;

/*Una  agencia  de llamadas  necesita  saber  el  precio  por  las llamadas  
telefónicas  realizadas por sus clientes y así poder calcular el monto a pagar.
Para ello se solicita realizar un programaen  Java  que  determine  el  monto  
a  pagar  por  una  llamada  telefónica  y  que  luego  diga  la cantidad de 
billetes y monedas a pagar por el cliente teniendo en cuenta lo siguiente:Una 
llamada  que  dura  hasta  3  minutos  tiene  un  costo  de20  centavos,  por 
cada  minuto adicional que dura la llamada se le sumará un monto de 0.5 centavos 
adicionales, por lo tanto se debe leer el tiempo de la llamada.El programa deberá
de imprimir el número de billetes y de monedas que el usuario debe de pagar por
el servicio de la llamada realizada. Por ejemplo si el usuario tiene que pagar
$15.50 Módulo:Metodologías ágiles para el desarrollo de software  --  Facilitador:Manuel de Jesús Gámez López. 
12el  programa  deberá  de  imprimir  lo  siguiente:  1  billete  de  diez  dólares,

un  billete  de  cinco dólares y dos monedas de veinticinco centavos.Monedas: 1, 5,10 y 25 
centavos Billetes: 1, 5, 10, 20 dólares Considere que debe darse la menor cantidad de billetes y monedas posibles.
El nombre de la clase creada será: BilletesYMonedas. */

public class BilletesYMonedas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double minutos;
        int billetes_1, billetes_5, billetes_10, billetes_20;
        int monedas_1, monedas_5, monedas_10, monedas_25;
        
        
        System.out.print("Ingrese los minutos de la llamada: ");
        
        minutos = leer.nextDouble();
        if(minutos == 3){
            System.out.println("Su pago es de: ");
        }else if(minutos > 3){
            
            double MinutosAumentados;
            MinutosAumentados = minutos - 3 *( 0.5 ) + 0.20;
            System.out.println("Total: " + MinutosAumentados);
        }
        
    }
}
