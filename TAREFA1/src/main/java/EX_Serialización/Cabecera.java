package EX_Serialización;

import java.io.*;

public class Cabecera extends ObjectOutputStream {
    public Cabecera(OutputStream out) throws IOException {
        super(out);
    }

    protected Cabecera() throws IOException, SecurityException {
    }

   /* protected Cabecera() throws IOException, SecurityException
    {
        super();
    }
    //Constructor que recibe como parámetro un objeto OutputStream
    protected Cabecera(OutputStream out) throws IOException {
        super(out);
    }*/


    protected void writeStreamHeader(){
    }
}
