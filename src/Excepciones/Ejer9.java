package Excepciones;

import java.util.Scanner;

public class Ejer9 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero=10;
		int [] ejemplo = new int[5];
		while(numero!=5) {
			try {
				throw new ArrayIndexOutOfBoundsException("Error");
				}
			}catch(ArrayIndexOutOfBoundsException ) {
				e.printStackTrace();
				numero--;
			}
		}
		System.out.println("Finalizado");
	}

	

}
