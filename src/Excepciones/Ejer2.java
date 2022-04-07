package Excepciones;

public class Ejer2 {
	
	
	public static void main(String [] args) throws Excepcion2{
		int  ejemplo []= new int[2];
		try {
			for(int i=0;i<3;i++) {
				ejemplo[i]=0;
			}
		} catch (Exception e) {
			String texto = "Error de index";
			throw new Excepcion2(texto);
		}
	}

}
