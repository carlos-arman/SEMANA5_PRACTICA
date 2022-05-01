import java.util.Scanner;

public class MetodoMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MasaCorporal mas = new MasaCorporal();

        System.out.print("Ingrese su nombre: ");
        mas.setNombre(leer.nextLine());
        System.out.print("Ingrese M o F segun su genero: ");
        mas.setGenero(leer.nextLine());
        System.out.print("Ingrese su estatura: ");
        mas.setEstatura(leer.nextDouble());
        System.out.print("Ingrese su peso: ");
        mas.setPeso(leer.nextInt());
    
 //1.79
 //164
        
       mas.imprimir();
       mas.MasaC();
        


    }
}
