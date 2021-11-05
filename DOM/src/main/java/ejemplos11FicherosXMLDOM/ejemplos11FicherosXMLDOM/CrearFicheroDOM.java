package ejemplos11FicherosXMLDOM.ejemplos11FicherosXMLDOM;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrearFicheroDOM {

	// usaremos para crear o XML un ficheiro previamente xerado na clase Ej01ClaveEsDireccion
	
	/* HAI QUE TER EN CONTA OS TAMA�OS DE CADA CAMPO
	 * boolean   1byte
	 * char	     2bytes
	 * byte      1byte
	 * short     2 bytes
	 * int       4 bytes
	 * long      8 bytes
	 * flota     4 bytes
	 * double    8 bytes
	 * @author antonio
	 *
	 */
	private static final long tamanhoRegistro = 35;

	public static void main(final String[] args) throws IOException {
		File fichero = new File("NUEVODIR\\NombresEdades.dat");
		RandomAccessFile raf = new RandomAccessFile(fichero, "r");
		// imos a ler o ficheiro aleatorio gardado en exercicios anteriores.

		int clave, edad;
		long posicion = 0; // posicion inicial de percorrido do ficheiro.
		String nombre;

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); // creamos unha instancia do parser
		// que usaremos para percorrer o arquivo.

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			DOMImplementation implementacion = db.getDOMImplementation();
			// creamos o documento vacio, co nome de documento, e xa indicamos cal vai ser o
			// primeiro
			// nodo do que dispon, neste caso Personas.
			Document documento = implementacion.createDocument(null, "Personas", null);
			documento.setXmlVersion("1.0"); // asignamos a versi�n do ficheiro xml, por defecto, 1.0

			for (;;) {// for sen par�metros, vaise percorrendo mentras haxa valores a ler.
				raf.seek(posicion); // Estamos lendo un ficheiro aleatorio, situamos o punteiro ao inicio do
									// ficheiro.
				clave = raf.readInt(); // A estrucutra do ficheiro, o primeiro que se le � un int.
				nombre = raf.readUTF();
				edad = raf.readInt(); // lemos un int

				if (clave > 0) { // o primeiro valor do arquivo era o valor clave, que ti�a que ser positivo.
					Element raiz = documento.createElement("persona");
					// creamos o nodo persona, lembrar que colga directamente do nodo principal
					// Personas.
					documento.getDocumentElement().appendChild(raiz);
					// o elemento persona que acabamos de crear (almacenado en raiz) indicamos que o
					// situe na ra�z do documento
					CrearElemento("clave", Integer.toString(clave), raiz, documento);
					// esta funci�n encargase de crear o elemento (etiqueta xml) para a clave.
					CrearElemento("nombre", nombre.trim(), raiz, documento); // trim para eliminar espazos aos dous
																				// lados.
					// esta funci�n encargase de crear o elemento (etiqueta xml) para o nombre
					CrearElemento("edad", Integer.toString(edad), raiz, documento);
					// esta funci�n encargase de crear o elemento (etiqueta xml) para a edad

				} // fin if clave

				posicion = posicion + tamanhoRegistro; // po�emos o punterio ao principio do seguinte rexistro(li�a) a
														// ler.
				if (raf.getFilePointer() == raf.length())// se a posicion do punteiro coincide coa lonxitude do
															// ficheiro, rematamos.
					break;
			} // fin do for que percorreo o arquivo

			// Pasamos agora a percorrer o ficheiro XML creado para poder ver o seu contido.
			Source fuente = new DOMSource(documento);// documento representa ao xml Personas.
			Result resultado = new StreamResult(new File("NUEVODIR\\Personas.xml"));
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(fuente, resultado);// aplicamos o transform para poder percorrer o xml.

			// para amosar o resultado por pantalla, podemos especificar como resultado o
			// canal de saida System.out
			Result consola = new StreamResult(System.out);// System.out para sacar por pantalla.
			transformer.transform(fuente, consola);

		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
		raf.close();
	}// fin do main

	// metodo de insercion dos datos da persona
	static void CrearElemento(final String datoPersona, final String valor, final Element raiz,
			final Document documento) {
		Element elemento = documento.createElement(datoPersona); // creamos elemento fillo
		Text texto = documento.createTextNode(valor); // damos valor ao fillo creado.
		raiz.appendChild(elemento); // pegamos o elemento fillo na raiz
		elemento.appendChild(texto); // pegamos o valor
	}// fin do metodo
}// fin da clase