package Coche;
import java.util.Scanner;

public class UsoCoche {
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in); // Scanner de enteros
		Scanner sc = new Scanner(System.in); //Scanner de Sring (por alguna razon al usar el mismo para ambos, el color queda en blanco)
		camioneta camioneta = new camioneta(); //Constructor
		int z=1;
		do {
			System.out.println("Que deseas hacer?\n[1] - Solicitar datos de la camioneta\n[2] - Modificar datos de la camioneta\n[3] - Salir");
			int j = entrada.nextInt(), k;
			switch(j) {
				case 1: //Datos de la camioneta
					
					System.out.println("La camioneta tiene los siguientes datos actuales");
					camioneta.ditodo();
					break;
					
				case 2: //Modificar datos
					
					int m=1;
					do {
						System.out.println("Que datos quieres cambiar?\n");
						System.out.println("[1] - Color\n[2] - Tipo de asiento\n[3] - Existencia de climatizador\n[4] - Traccion\n[5] - Finalizar modificacion");
						int i = entrada.nextInt();
						switch(i) {
							case 1: //Modificar color
								System.out.println("De que color es la camioneta?");
								String color=sc.nextLine();
								camioneta.configuracolor(color);
								break;
								
							case 2: //Modificar asientos.
								
								System.out.println("Los asientos son de cuero?\n[1] - SI          [2] - NO");
								k = entrada.nextInt();
								camioneta.configuracionasientos(k);
								break;
								
							case 3: //Modificar climatizador
								
								System.out.println("La camioneta tiene climatizador?\n[1] - SI          [2] - NO");
								k = entrada.nextInt();
								camioneta.configuracionclimatizador(k);
								break;
								
							case 4: //Modificar climatizador
								
								System.out.println("Seleccione uno\n\n[1] La camioneta tiene traccion automatica\n[2] La camioneta tiene traccion manual");
								k = entrada.nextInt();
								camioneta.configuraciontraccion(k);
								break;
								
							case 5: //Terminar
								m=0;
								break;
								
							default: //Repetir con datos erroneos
								
								System.out.println("Opcion incorrecta, intente de nuevo");
						}
					}while(m==1);
					break;
						
				case 3: //Terminar
						
					z=0;
					break;
					
				default:
						
					System.out.println("Opcion incorrecta, intente de nuevo");
					z=1;
					break;
			}
			
		}while(z==1);
		
		//Datos del coche
		/*
		coche renault = new coche();
		
		System.out.println("Desea cambiar los datos de algun vehiculo?");
		System.out.println(renault.diruedas());
		
	//	System.out.println(renault.dilargo());
		
		System.out.println("Que color tiene el coche?");
		renault.configuracolor(JOptionPane.showInputDialog("Diga el color del coche"));
		
		System.out.println(renault.dicolor());
		
		renault.configuracionasientos(JOptionPane.showInputDialog("El coche tiene asientos de cuero?"));
		System.out.println(renault.diasiento());
		
		renault.configuracionclimatizador(JOptionPane.showInputDialog("El coche tiene climatizador?"));
		System.out.println(renault.diclimatizador());
		
		System.out.println(renault.dipeso());
		
		System.out.println("El precio del coche es "+renault.preciocoche());
		
		System.out.println("Deseas ver los datos del coche?");
		String a = JOptionPane.showInputDialog("Deseas ver los datos del coche?");
		
		if(a.equalsIgnoreCase("Si")) {
			renault.ditodo();
		}
		*/
		
		//Cerrar entradas para evitar fugas de informacion
		entrada.close();
		sc.close();
	
		}
}
