/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author  Armando
 */
public class EstructuraSwitchCha {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar el estado civil de la persona:");
        String estadocivil = leer.readLine();

        switchChar(estadocivil.toUpperCase() .charAt(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void switchChar(char estadocivil){
        String MensajeEstadoCivil;
        switch(estadocivil){
            case 'S':
            MensajeEstadoCivil = "Soltero/a";
            break;
            case 'C':
            MensajeEstadoCivil = "Casado/a";
            break;
            case 'D':
            MensajeEstadoCivil = "Divorsiado/a";
            break;
            case 'A':
            MensajeEstadoCivil = "Acompañado/a";
            break;
            case 'F':
            MensajeEstadoCivil = "Forever Alone";
            break;
            default:
            MensajeEstadoCivil = "Estado Civil erroneo";
        }
        System.out.println("Su estado civil es: " + MensajeEstadoCivil);
    }
}
