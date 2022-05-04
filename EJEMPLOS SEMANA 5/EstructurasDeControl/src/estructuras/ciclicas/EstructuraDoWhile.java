
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese un número límite de repeticion: ");
            String limite = leer.readLine();
            //Casting o convercion de datos al momento de envio
            instruccinDoWhile(Integer.parseInt(limite));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void instruccinDoWhile(int valorLimite) {
        int i = 1;//Valor inicial del contador
        do{ // Realiza por lo menos una vez la acción
            System.out.println("El valor de la repeticion es: " + i);
            i++; //Incremento del contador
        }while(i <=valorLimite);//Evalua la condicion antes de volber a repetir 
    }
    
}
