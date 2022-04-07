package Herencia;
/**
 * 
 * @author Ismael Orellana Bello
 * @version 1.0
 * @date 28/03/2022
 *
 *	Clase programador que hereda de la Clase Empleado sus m�todos 
 *	y variables y que pos�e m�todos propios
 *
 */
public class Programador extends Empleado{
	
	//Variables de la clase
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	/**
	*	Constructor de la clase programador que no recibe ning�n par�metro
	*	y realiza una serie de m�todos
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
	*	Constructor de la clase programador que recibe par�metros
	*	y realiza una serie de m�todos
	*	@params lineasDeCodigoPorHora - tipo int - Par�metro que cuenta el n�mero de l�enas por hora 
	*   @params lenguajeDominante -tipo String - Par�metro que define que lenguaje es el que domina
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
	*	M�todo que recibe unos valores y los guarda
	*	@params lineasDeCodigoPorHora - tipo int - Par�metro que cuenta el n�mero de l�enas por hora 
	*   @params lenguajeDominante -tipo String - Par�metro que define que lenguaje es el que domina
	*/
	public void addProgramador(int lineasDeCodigoPorHora,String lenguajeDominante) {
		this.lenguajeDominante=lenguajeDominante;
		this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
		System.out.println("Programador a�adido");
	}
	/**
	*	M�todo que imprime los datos de la clase programador
	*
	*/
	public void imprimirDatosProgramador() {
		System.out.println("L�neas de c�digo por hora: "+lineasDeCodigoPorHora+"\n Lenguaje dominante: "+lenguajeDominante);
	}
	
	
}
