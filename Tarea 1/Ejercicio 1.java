package Ejercicios;
import java.util.Scanner;

//Ejercicio 1 enviado el 20/05/2022

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual es su nombre?");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su edad");
		int edad = entrada.nextInt();
		
		System.out.println("Ingrese su sueldo en dolares");
		double sueldo = entrada.nextDouble();
		
		System.out.println("Su nombre es: "+nombre+", su edad es de "+edad+", y su sueldo es de: "+sueldo+"$");
		
		entrada.close();
	}

}
