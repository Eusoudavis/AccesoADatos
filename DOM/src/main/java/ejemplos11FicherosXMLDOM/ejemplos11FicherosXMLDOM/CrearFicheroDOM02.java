package ejemplos11FicherosXMLDOM.ejemplos11FicherosXMLDOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import java.io.File;

public class CrearFicheroDOM02 {
	// neste exemplo imos a crear un ficheiro xml directamente.
	// e probamos a meter atributos a algunha etiqueta.

	public static void main(String argv[]) {

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// elemento raiz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("compania");
			doc.appendChild(rootElement);

			// empleado
			Element empleado = doc.createElement("empleado");
			rootElement.appendChild(empleado);

			// atributo do elemento empleado
			Attr attr = doc.createAttribute("id");// crea o atributo id
			attr.setValue("1"); // asigna valor ao atributo
			empleado.setAttributeNode(attr);// engade o atributo ao elemento empleado.

			// nombre
			Element nombre = doc.createElement("nombre");
			nombre.appendChild(doc.createTextNode("Manuel"));
			empleado.appendChild(nombre);

			// apellidos
			Element apellidos = doc.createElement("apellidos");
			apellidos.appendChild(doc.createTextNode("Gonzalez"));
			empleado.appendChild(apellidos);

			// seccion
			Element seccion = doc.createElement("seccion");
			seccion.appendChild(doc.createTextNode("almacen"));
			empleado.appendChild(seccion);

			// salario
			Element salario = doc.createElement("salario");
			salario.appendChild(doc.createTextNode("1000"));
			empleado.appendChild(salario);

			// dia depende de salario
			Element dia = doc.createElement("dia");
			dia.appendChild(doc.createTextNode("31"));
			salario.appendChild(dia);

			// mes
			Element mes = doc.createElement("mes");
			mes.appendChild(doc.createTextNode("10"));
			salario.appendChild(mes);

			// anho
			Element anho = doc.createElement("anho");
			anho.appendChild(doc.createTextNode("2018"));
			salario.appendChild(anho);

			// escribimos o contido nun arquivo .xml
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File("NUEVODIR\\archivo.xml")); // se queremos sacar un ficheiro.

			//StreamResult result = new StreamResult(System.out); //Se queremos sacalo por
			// pantalla.

			transformer.transform(source, result);

			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

}// fin da clase