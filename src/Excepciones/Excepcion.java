package Excepciones;

public class Excepcion extends Throwable{

	public Excepcion(String texto){
		super("Excepcion personal: "+texto);
	}
	
}
