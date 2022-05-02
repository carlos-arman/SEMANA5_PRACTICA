/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author   Armando
 */
public class EstructuraWhile {
    
    public static void main(String[] args) {
        try{
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresar un numero limite de repeticion:");
            String limite = leer.nextLine();
            if(limite == null){
                System.out.println("Dato invalido!");
            }else {
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void instruccionWhileSencillo(int valorLimite){
        int i = 1;
        while(i<=valorLimite){
            System.out.println("El valor de la repeticion es: " + i);
            i++;
        } 
    }
}
