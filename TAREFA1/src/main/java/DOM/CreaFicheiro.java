package DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

/*
* 1. Crea un programa Java que implemente as seguintes funcionalidades
a. O programa crea un ficheiro denominado “FichPersona.dat”
* que almacena varios obxectos persona (como mínimo almacena o nome e a idade das persoas)
*
b. Tomando como base o documento xerado no apartado a, crea un documento XML usando
DOM, a este xml xerado poñemoslle de nome empleados.xml
*
c. Finalmente, debes definir unha funcionalidade que permita ler o documento empleados.xml
creado no punto anterior e amosar a información por pantalla.
* */
public class CreaFicheiro {

   // private static final long tamanhoRegistro = 35;

    public static void main(String[] args) {
        File f = new File("FichPersona.dat");


        escrituraObjetos(f);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(f);
            documento.getDocumentElement().normalize();
            System.out.println("Elemento raiz: " +documento.getDocumentElement().getNodeName());
            NodeList personas = documento.getElementsByTagName("Persona");

            for (int i=0; i< personas.getLength(); i++){
                Node persona = personas.item(i);
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

    static void escrituraObjetos(File f){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        Cabeceira cabeceira = null;

        try{
            if (f.exists()){
            fo = new FileOutputStream("Alumnos1.dat", true);
            cabeceira = new Cabeceira(fo);
                Persona persoa4 = new Persona("Tono", 26 );
                Persona persoa5 = new Persona("Silvia", 24 );
                Persona persoa6 = new Persona("Martín",  22 );

                // escribimos en el fichero
                oo.writeObject(persoa4);
                oo.writeObject(persoa5);
                oo.writeObject(persoa6);

            //creo los objetos a escribir

            }else{
                    fo = new FileOutputStream("Alumnos1.dat");
                    oo = new ObjectOutputStream(fo);
                Persona persoa1 = new Persona("Mar�a", 25 );
                Persona persoa2 = new Persona("Juan", 32 );
                Persona persoa3 = new Persona("Marta",  22 );

                // escribimos en el fichero
                oo.writeObject(persoa1);
                oo.writeObject(persoa2);
                oo.writeObject(persoa3);
        }
        }catch(FileNotFoundException fn){
            System.out.println("Error. Fichero no existe");
        }catch(IOException io){
            System.out.println("Error de escritura");
        }
    }


    }
