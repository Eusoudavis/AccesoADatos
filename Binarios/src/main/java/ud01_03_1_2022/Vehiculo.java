package ud01_03_1_2022;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 2435234;
	// se por exemplo, tes gravado un ficheiro con obxectos sun cun serialversion
	// determinado
	// e posteriormente, modificas o serial na clase e tentas ler o ficheiro
	// anteriormente
	// creado darache erro.
// Propiedades
	private String matricula;
	private String marca;
	private transient double deposito; //con isto indicamos que non imos serializar este atributo.
//	private  double deposito;
	private String modelo;

// Constructor
	public Vehiculo() {
	}

// Métodos
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
	//	return "ten de litros: "+ deposito+ " Matricula: " + matricula + ". Marca: " + marca + ".Modelo: " + modelo;
		//co anterior sería para demostrar que se usamos trasiente, o deposito non se alamacena no obxecto.
		return " Matricula: " + matricula + ". Marca: " + marca + ".Modelo: " + modelo;
	}
}