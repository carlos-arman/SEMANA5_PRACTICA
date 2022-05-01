/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Armando
 */
public class LecturaCaracteres {
    public static void main(String[] args) {
        try{
                BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingresar el nombre:");
                String nombre = leer.readLine();
                
                //PASA TODO A MASYUSCULAS
                leerCaracteresFor(nombre.toUpperCase());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void leerCaracteresFor(String palabra){
        for(int i = 0; i < palabra.length(); i++){
            System.out.println("Caracter: " + i + " ->: " + palabra.charAt(i));
    }
    }
}
