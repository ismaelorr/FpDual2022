package Excepciones;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) throws Excepcion{
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Dime una letra si quieres provocar una excepcion");
			int num=sc.nextInt();
		} catch (Exception e) {
			throw new Excepcion("Has introducido un dato erróneo");
		}finally {
			System.out.println("I was here");
		}
	}

}
