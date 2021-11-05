package ejemplos11FicherosXMLDOM.ejemplos11FicherosXMLDOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaFicheroDOM {

	//imos ler o arquivo xml xerado na clase CrearFicheroDOM.java executada anteriormente.
	
	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document documento = db.parse(new File("Personas.xml"));
			//O m�todo devolve o documento DOM que se vai a crear para o ficheiro XML
			documento.getDocumentElement().normalize();
			/*
			 * o m�todo normalize encargase de cando fai a lectura do xml, eliminar espazos en blanco
			 * xuntar etiquetas se hai saltos de li�as, po�er o texto no formato unicode.. etc.
			 *  Forms.
			 */
			System.out.println("Elemento raiz: " +documento.getDocumentElement().getNodeName());
			// getNodeName() imprime o nome do elemento raiz do documento xml.

			//crea unha lista con todos os nodos de personas
			NodeList personas = documento.getElementsByTagName("persona");
			/*
			 * Por medio de este m�todo o que se selecciona � unha lista de nodos cuxo elemento
			 * � o especificado como par�metro; a cada un dos nodos asignaselle un �ndice
			 * dacoro ao orde no que aparecen no marcado do documento.  
			 */

			// percorre a lista
			for(int i=0; i< personas.getLength(); i++){
				Node persona = personas.item(i); // obtener un nodo
				if(persona.getNodeType() == Node.ELEMENT_NODE){ // tipo de nodo
					Element elemento = (Element) persona; //obtemos os elementos do nodo

					System.out.println("Clave: " +getNodo("clave", elemento));
					System.out.println("Nombre: " +getNodo("nombre", elemento));
					System.out.println("Edad: " +getNodo("edad", elemento));

				}// fin if
			}// fin for

		}catch(Exception e){
			e.printStackTrace();
		}
	}// fin main

	// obtener a informaci�n dun  nodo
	private static String getNodo(final String etiqueta, final Element elemento){
		NodeList nodo = elemento.getElementsByTagName(etiqueta).item(0).getChildNodes();
		/*
		 * getChildNodes() para obter a lista dos nodos fillo dun elemento
		 */
		Node valorNodo = nodo.item(0);
		//metodo item() devolve o valor do nodo indicado como par�metro.
		return valorNodo.getNodeValue(); // devolve o valor do nodo.
	}

}// fin clase