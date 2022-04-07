package Excepciones;

public class Ejer5 {

	public static void main(String [] args) throws Excepcion2{
		try{
		new Ejer5().f();
		}catch(Excepcion2 e){
			throw e;
		}
		
	}
	
	public void f() throws Excepcion2{
		try {
			g();
		}catch(Excepcion e){
			e.printStackTrace();
			throw new Excepcion2("Ejemplo");
		}
	}
	
	public  void g() throws Excepcion{
		throw new Excepcion("Ejemplo2");
	}
}

	
