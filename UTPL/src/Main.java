import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        String apellido;

        System.out.println("Por favor ingrese sus nombre");
        nombre = entrada.next();

        System.out.println("Por favor ingrese su apellido:");
        apellido = entrada.next();

        System.out.println("Su nombre es " + nombre + " y su apellido es " + apellido);


    }
}
