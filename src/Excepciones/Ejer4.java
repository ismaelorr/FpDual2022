package Excepciones;

public class Ejer4 {

	public static void main(String[] args) {
		String saludo = null;
		try {
			metodoEjemplo(saludo);			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void metodoEjemplo(String texto){
			
	}
}
