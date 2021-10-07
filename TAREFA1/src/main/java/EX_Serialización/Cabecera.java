package EX_Serialización;

import java.io.*;

public class Cabecera extends ObjectOutputStream {

    public Cabecera(OutputStream out) throws IOException {
        super(out);
    }

    protected Cabecera() throws IOException, SecurityException {
    }

    protected void writeStreamHeader(){
    }
}
