package ud01_03_1_2022;

import java.io.*;

public class EscribirSinCabecera extends ObjectOutputStream {
// Constructor
	public EscribirSinCabecera(OutputStream out) throws IOException {
		super(out);
	}

	public EscribirSinCabecera() throws IOException, SecurityException {
		super();
	}

	/**
	 * Redefinición de la clase ObjectOuputStream para que no escriba una cabecera
	 * al inicio del Stream. Para no tener problemas con las cabeceras de los
	 * objetos y evitar el error StreamCorruptedException, creamos una clase con
	 * nuestro propio ObjectOutputStream, heredando del original y redefiniendo el
	 * método writeStreamHeader() vacío, para que no haga nada.
	 */
	protected void writeStreamHeader() throws IOException {
	}
}