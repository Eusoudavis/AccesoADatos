import java.io.Serializable;

public class Persona implements Serializable {
	
	/* serialVersionUID = 1L
	El tiempo de ejecuci�n de serializaci�n asocia con cada clase serializable 
	un n�mero de versi�n, llamado serialVersionUID, que se utiliza durante la deserializaci�n para 
	verificar que el emisor y el receptor de un objeto serializado hayan cargado clases para ese objeto 
	que son compatibles con respecto a la serializaci�n*/
	
	private static final long serialVersionUID = 1L; 
	//atributos
	String nombre;
	int edad;

	// constructores
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
	}
	// metodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
