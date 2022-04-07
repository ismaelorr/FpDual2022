package Excepciones;

import java.util.Scanner;

public class Ejer7 {
	
	
	private int numero=0;
	
	public static void main(String [] agrs) {
		int  ejemplo []= new int[2];
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0;i<3;i++) {
				ejemplo[i]=0;
			}
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
			try {
				int division=1/0;
			}catch(ArithmeticException ex){
			ex.printStackTrace();
			try {
				String saludo = null;
				if(saludo.equals("Hola")) {
					System.out.println(saludo);
				}
			}catch(NullPointerException exc){
			exc.printStackTrace();
		}
	}
  }
}
}
