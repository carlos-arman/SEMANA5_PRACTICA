import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraSwitchChar{
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
            case '5':
            MensajeEstadoCivil = "Soltero/a";
            case 'C':
            MensajeEstadoCivil = "Casado/a";
            case 'D':
            MensajeEstadoCivil = "Divorsiado/a";
            case 'A':
            MensajeEstadoCivil = "Acompañado/a";
            case 'F':
            MensajeEstadoCivil = "Forever Alone";
            break;
           
            default:
            MensajeEstadoCivil = "Estado Civil erroneo";
        }
        System.out.println("Su estado civil es: " + MensajeEstadoCivil);
    }
}