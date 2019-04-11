import java.util.Scanner;

public class EjemploClase22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;
        String ciudad, pais;
		double notas;
		double promedio;
		
        System.out.println("Por favor ingrese sus nombre");
        nombre = entrada.next();

        System.out.println("Por favor ingrese su apellido:");
        apellido = entrada.next();

        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor ingrese su ciudad:");
        ciudad = entrada.next();

		System.out.println("Por favor ingrese su pais:");
        pais = entrada.next();
	
		System.out.println("Por favor ingrese su notas:");
        notas = entrada.nextInt();
		
		System.out.println("Por favor ingrese su promedio:");
        promedio = entrada.nextInt();
		
        System.out.printf("Sus nombres y apellidos: %s %s \n", nombre, apellido);
        System.out.println("Edad: " + 30);
        System.out.println("Ciudad: " + ciudad);
		System.out.println("Pais: " + pais);
		System.out.println("Notas: " + notas);
		System.out.println("Promedio: " + promedio);
    }
}