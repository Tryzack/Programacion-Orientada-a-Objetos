package Coche;
public class camioneta {
	
	private int ruedas, pesototal, pesomotor, capacidad;
	private double largo, ancho;
	private String color, serialmotor;
	private boolean asientocuero, climatizador, traccionautomatica;
	
	//metodo constructor (asignar caracterisiticas iniciales)
	
	public camioneta() { //valores que no cambian
		ruedas=4;
		largo=5525;
		ancho=1815;
		serialmotor="D22T";
		pesomotor=1500;
		capacidad=1250;	
		color="negro"; //valor default
		traccionautomatica=false; //valor default
		asientocuero=false; //valor default
		climatizador=false; //valor default
	}
	
	public String ditraccion() {
		if(traccionautomatica==true) {
			return "La camioneta tiene traccion automatica";
		}else {
			return "La camioneta tiene traccion manual";
		}
	}
	
	public String diruedas() { //getter
		return "La camioneta tiene "+ruedas+" ruedas";
	}
	
	public String dilargo() { //getter
		return "El largo de la camioneta es "+largo;
	}
	
	public String diancho() { //getter
		return "El ancho de la camioneta es "+ancho;
	}
	
	public String dicapacidad() { //getter
		return "La capacidad de la camioneta es "+capacidad+" kilogramos";
	}
	
	public String dicolor() { //getter
		return "El color de la camioneta es "+color;
	}
	
	public String diasiento() { //getter
		if(asientocuero==true){
			return "La camioneta tiene asientos de cuero";
		}else {
			return "La camioneta tiene los asientos de serie";
		}
	}
	
	public String diclimatizador(){ //getter
		if(climatizador==true) {
			return "La camioneta tiene climatizador";
		}else {
			return "La camioneta tiene solo aire acondicionado";
		}
	}
	
	public String diserialmotor() { //getter
		return "El serial del motor de la camioneta es "+serialmotor;
	}
	
	public String dipeso(){ //setter y getter
		int pesocarroceria=1500;
		pesototal = pesomotor+pesocarroceria;
		if(asientocuero==true) {
			pesototal += 50;
		}else {
			pesototal += 20;
		}
		if(climatizador==true) {
			pesototal += 20;
		}else {
			pesototal += 5;
		}
		if(traccionautomatica==true) {
			pesototal+=100;
		}else {
			pesototal+=40;
		}
		return "El peso de la camioneta es de "+pesototal+" kilogramos";
	}
	
	public void configuracolor(String x) { //setter
		color = x;
	}
	
	public void configuracionasientos (int asientocuero){ //setter
		if (asientocuero==1) {
			this.asientocuero=true;
		} else {
			this.asientocuero=false;
		}
	}
	
	public void configuracionclimatizador(int climatizador){ //setter
		if(climatizador==1) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public void configuraciontraccion(int traccionautomatica){ //setter
		if(traccionautomatica==1) {
			this.traccionautomatica=true;
		}else {
			this.traccionautomatica=false;
		}
	}
	
	public String preciocamioneta() { //setter y getter
		int preciofinal = 35000;
		if(asientocuero==true) {
			preciofinal += 4000;
		}else {
			preciofinal += 1000;
		}
		if(climatizador==true) {
			preciofinal += 2000;
		}else {
			preciofinal += 1000;
		}
		if(traccionautomatica==true) {
			preciofinal += 3000;
		}else {
			preciofinal += 1500;
		}
		return "El precio final de la camioneta es de "+preciofinal+" dolares";
	}
	
	
	public void ditodo() {
		System.out.println("\n"+diruedas());
		System.out.println(dilargo());
		System.out.println(diancho());
		System.out.println(diserialmotor());
		System.out.println(dipeso());
		System.out.println(dicolor());
		System.out.println(diasiento());
		System.out.println(diclimatizador());
		System.out.println(ditraccion());
		System.out.println("\n"+preciocamioneta()+"\n");
	}
}
