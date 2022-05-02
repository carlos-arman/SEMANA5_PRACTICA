/*Nos piden desarrollar un programa que sea capaz de determinar la comisión devengada por los trabajadores de una 
empresa de electrodomésticos. La política de la empresa consiste en pagar el 5% de comisión sobre las ventas a todo 
vendedor de género femenino. En el caso de los vendedores de género masculino la comisión pagada corresponde al 
3% sobre las ventas. El salario base para todos los vendedores sin importar el sexo es de $200 por lo que para 
calcular el salario obtenido por cada vendedor es requerido calcular la comisión y sumarle el salario base. El programa 
deberá imprimir el monto del salario base, el monto de la comisión obtenida y el salario final devengado por cada 
vendedor.*/
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComisionVendedor {
    public static void main(String[] args) {
        try{//Objeto leer de la clase BefferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            System.out.println("Ingresar valor de la venta:");
            double valorVenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el genero del vendedor:");
            String genero = leer.readLine();
            //Envia el parametro valorVenta y la inicial del genero ingresado en mayuscula
            calcularComision(valorVenta, genero.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void calcularComision(double valorVenta, char generoVendedor){
        double comision, salario = 0.0; //Es necesario inicializar las variables
        String genero = ""; //Si no se inicializa provoca un  error en la linea
        if(generoVendedor == 'M'){
            genero = "Masculino";
            comision = valorVenta * 0.03;
            salario = comision + 200;
        }else if(generoVendedor == 'F'){
            genero = "Femenino";
            comision = valorVenta * 0.05;
            salario = comision + 200;
        }
        // Las variables genero y salario se deben de inicializar
        System.out.println("El salario del vendedor " + genero + " es de " + salario);
    }
    
}
