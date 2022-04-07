package Excepciones;

public class Ejer8 {

	public static void main(String[] args) {
		int  ejemplo []= new int[2];
		try {
			for(int i=0;i<3;i++) {
				ejemplo[i]=0;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
