package Calculadora;

public class Operaciones {

	    double answer;

	    public void suma(double a, double b){
	        answer = a + b;
	        System.out.println("La respuesta es: "+answer);
	    }

	    public void resta(double a, double b){
	        answer = a - b;
	        System.out.println("La respuesta es: "+answer);
	    }

	    public void division(double a, double b){
	    	if(b!=0) {
	    		answer = a / b;
	    		System.out.println("La respuesta es: "+answer);
	    	}else{
	    		System.out.println("No se puede dividir entre 0");
	    	}
	    }

	    public void multiplicacion(double a, double b){
	        answer = a * b;
	        System.out.println("La respuesta es: "+answer);
	    }
}
