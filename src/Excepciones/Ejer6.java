package Excepciones;

public class Ejer6 {
	
	public static void main(String [] args) {
		f();
	}
	
	public static void f() {
		try {
			g();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void g() {
		int  ejemplo []= new int[2];
		for(int i=0;i<3;i++) {
			ejemplo[i]=0;
		}
	}
}
