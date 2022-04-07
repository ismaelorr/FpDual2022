package Excepciones;

public class Excepcion2 extends Throwable{

	private String texto;
	
	public Excepcion2(String texto) throws Excepcion2{
		super("Excepcion2"+texto);
		this.texto=texto;
	}
	
	
}
