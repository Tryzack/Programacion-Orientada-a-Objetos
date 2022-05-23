package Calculadora;
import java.util.Scanner;

public class Pregunta {
	  public static void main(String[] args) {
		  
	        Operaciones calculo = new Operaciones();
	        
	        int m;
	        Scanner entrada = new Scanner(System.in);
	        
	        do{
		        
		        double a, b;
		        int n, z;
		        
		        do {
			        System.out.println("Selecciona la operacion a realizar");
			        System.out.println("(1) Suma");
			        System.out.println("(2) Resta");
			        System.out.println("(3) Division");
			        System.out.println("(4) Multiplicacion");
			        n = entrada.nextInt();
			        
			        if(n!=1 && n!=2 && n!=3 && n!=4) {
			        	System.out.println("Por favor introduzca un valor adecuado\n");
			        	z=1;
			        }else{
			        	z=0;
			        }
		        }while(z==1);
		        
		        System.out.print("Por favor introduce el primer numero\n");
		        a = entrada.nextDouble();
		        System.out.print("Por favor introuce el segundo numero\n");
		        b = entrada.nextDouble();
	
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
		        do {
		        	
			        System.out.println("Desea reiniciar? \n (1) SI ---  NO (2)");
			        m = entrada.nextInt();
			        
			        if(m!=2 && m!=1) {
			        	System.out.println("Por favor introduzca un valor adecuado\n");
			        	z=1;
			        }else{
			        	z=0;
			        }
			        
		        }while(z==1);
		        
	        }while(m==1);
	        
	        entrada.close();
	  }
}
