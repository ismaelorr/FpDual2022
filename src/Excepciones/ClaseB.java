package Excepciones;

public class ClaseB extends ClaseA{

	public ClaseB() {
		super();
	}
	
	@Override
	public void excepcion1() {
		throw new IllegalArgumentException();
	}
	
}
