package Default;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
	
	public static void main(String args[]){
		
	int a=0, b=0;
	
	System.out.println("Introduce el numero entero positivo a dividir");
	a = agregarValor(a);
	
	System.out.println("\nIntroduzca el numero entero positivo divisor");
	b = agregarValor(b);
	b = comprobarDistinto0(b);
	System.out.println("\nLa division de "+a+" entre "+b+" da como resultado: "+division(a, b));
	}
	
	public static int agregarValor(int x) {
		Scanner entrada = new Scanner(System.in);
		try {
			x = entrada.nextInt();
		} catch(InputMismatchException excepcion) {
			System.out.println(excepcion+": Error, el numero introducido debe ser un NUMERO ENTERO POSITIVO\nPor defecto sera 1");
			x=1;
		}
		try {
			if (x<0) throw new Exception("El numero introducido debe ser positivo");
			
		} catch (Exception excepcion) {
			System.out.println(excepcion+" \nSe usara el mismo numero introducido pero positivo");
			x=-x;			
		}
		return x;
	}
	
	public static int comprobarDistinto0(int x) {
		try {
			if(x==0) throw new Exception("El divisor debe ser distinto de 0");
		} catch (Exception excepcion) {
			System.out.println(excepcion+" \nPor defecto el divisor sera 1");
			return 1;
		}
		return x;
	}
	public static double division(int x, int y) {
		double a=x, b=y;
		return a/b;
	}
	
}
