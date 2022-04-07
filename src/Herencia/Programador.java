package Herencia;
/**
 * 
 * @author Ismael Orellana Bello
 * @version 1.0
 * @date 28/03/2022
 *
 *	Clase programador que hereda de la Clase Empleado sus métodos 
 *	y variables y que posée métodos propios
 *
 */
public class Programador extends Empleado{
	
	//Variables de la clase
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	/**
	*	Constructor de la clase programador que no recibe ningún parámetro
	*	y realiza una serie de métodos
	*/
	public Programador() {
		super();
		super.addEmpleado("Ismael","no se que es cedula", 23, false, 1200);
		addProgramador(200, "Java");
		super.mostrarClasificacion();
		super.imprimirDatos();
		imprimirDatosProgramador();
	}
	
	/**
	*	Constructor de la clase programador que recibe parámetros
	*	y realiza una serie de métodos
	*	@params lineasDeCodigoPorHora - tipo int - Parámetro que cuenta el número de líenas por hora 
	*   @params lenguajeDominante -tipo String - Parámetro que define que lenguaje es el que domina
	*/
	
	public Programador(int lineasDeCodigoPorHora,String lenguajeDominante) {
		super("Mariano","no se que es cedula", 35, true, 2400);
		this.lenguajeDominante=lenguajeDominante;
		this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
		super.mostrarClasificacion();
		super.imprimirDatos();
		imprimirDatosProgramador();
	}
	
	/**
	*	Método que recibe unos valores y los guarda
	*	@params lineasDeCodigoPorHora - tipo int - Parámetro que cuenta el número de líenas por hora 
	*   @params lenguajeDominante -tipo String - Parámetro que define que lenguaje es el que domina
	*/
	public void addProgramador(int lineasDeCodigoPorHora,String lenguajeDominante) {
		this.lenguajeDominante=lenguajeDominante;
		this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
		System.out.println("Programador añadido");
	}
	/**
	*	Método que imprime los datos de la clase programador
	*
	*/
	public void imprimirDatosProgramador() {
		System.out.println("Líneas de código por hora: "+lineasDeCodigoPorHora+"\n Lenguaje dominante: "+lenguajeDominante);
	}
	
	
}
