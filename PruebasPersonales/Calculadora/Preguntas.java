package Calculadora;
import java.util.Scanner;
public class Pregunta {
	  public static void main(String[] args) {

	        Operaciones calculo = new Operaciones();


	        Scanner entrada = new Scanner(System.in);
	        double a, b;
	        int n;
	        
	        System.out.println("Selecciona la operacion a realizar");
	        System.out.println("(1) Suma");
	        System.out.println("(2) Resta");
	        System.out.println("(3) Division");
	        System.out.println("(4) Multiplicacion");
	        n = entrada.nextInt();
	        
	        System.out.print("Por favor introduce el primer numero\n");
	        a = entrada.nextDouble();
	        System.out.print("Por favor introuce el segundo numero\n");
	        b = entrada.nextDouble();
	        
	        entrada.close();

	        switch (n){
	        case 1:
	            calculo.suma(a, b);
	            System.out.println();
	            break;
	        case 2:
	            calculo.resta(a, b);
	            break;
	        case 3:
	            calculo.division(a, b);
	            break;
	        case 4:
	            calculo.multiplicacion(a, b);
	            break;
	        default:
	        	System.out.println("La opcion que usted ha seleccionado no es correcta");
	        	break;
	        }
	  }
}
