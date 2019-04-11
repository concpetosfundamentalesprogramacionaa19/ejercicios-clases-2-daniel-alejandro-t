import java.util.Scanner;

public class EjemploClase22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;
        String ciudad;

        System.out.println("Por favor ingrese sus nombre");
        nombre = entrada.next();

        System.out.println("Por favor ingrese su apellido:");
        apellido = entrada.next();

        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor ingrese su ciudad:");
        ciudad = entrada.next();

        System.out.println("Su nombre es: " + nombre);
        System.out.println("\tSu apellido es: " + apellido + ", edad: " + 30);
        System.out.println("Ciudad: " + ciudad);
    
    }
}