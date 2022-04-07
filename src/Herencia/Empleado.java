package Herencia;
/**
 * 
 * @author Ismael Orellana Bello
 * @version 1.0
 * @date 28/03/2022
 *
 *
 *	Clase padre Empleado con una serie de m�todos para verificar 
 *	datos
 *
 */
public class Empleado {
	
	//Variables
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	/**
	*	Constructor de la clase Empleado que est� vac�o
	*
	*/
	public Empleado() {
		
	}
	
	/**
	*	Constructor de la clase Empleado que recibe una serie de par�metros
	*	y los guarda
	*
	*	@params nombre -tipo String- Variable que indica el nombre
	*	@params cedula - tipo String-
	*	@params edad -tipo int- Variable que indica la edad del Empleado
	*	@params casado - tipo boolean- Recibe true si est� casado y false si est� soltero
	*	@params salario -tipo double- Recibe el salario del Empleado
	*/
	public Empleado(String nombre,String cedula,int edad,boolean casado,double salario) {
		this.nombre=nombre;
		this.cedula=cedula;
		this.edad=edad;
		this.casado=casado;
		this.salario=salario;
	}
	/**
	*	M�todo que a�ade un Empleado y guarda sus datos
	*
	*	@params nombre -tipo String- Variable que indica el nombre
	*	@params cedula - tipo String-
	*	@params edad -tipo int- Variable que indica la edad del Empleado
	*	@params casado - tipo boolean- Recibe true si est� casado y false si est� soltero
	*	@params salario -tipo double- Recibe el salario del Empleado
	*/
	
	public void addEmpleado(String nombre,String cedula,int edad,boolean casado,double salario) {
		this.nombre=nombre;
		this.cedula=cedula;
		this.edad=edad;
		this.casado=casado;
		this.salario=salario;
	}
	
	/**
	*	M�todo que comprueba en que clasificaci�n se encuentra un Empleado
	*	mediante una serie de condiciones en base a su edad
	*
	*/
	public void mostrarClasificacion() {
		String clasificacion="";
		if(edad>=18 && edad<=45) {
			if(edad<=21) {
				clasificacion="Principiante";
			}
			else if(edad>=22 && edad<=35) {
				clasificacion="Intermedio";
			}
			else if(edad>35) {
				clasificacion="Senior";
			}
			System.out.println("Clasificacion: "+clasificacion);
		}
		else {
			System.out.println("Edad introducida err�nea");
		}
	}
	
	/**
	*	M�todo que imprime los datos de la clase Empleado
	*
	*/
	public void imprimirDatos() {
		String condicion="";
		if(casado) 
			condicion="si";
		else
			condicion="no";
		System.out.println("Nombre:"+nombre+"\n cedula: "+cedula+"\n edad: "+edad+"\n casado : "+condicion+
							"\n salario: "+salario);
	}


	
}
