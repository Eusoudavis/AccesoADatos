package EX_Binario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Cabeceira extends ObjectOutputStream {
    protected Cabeceira() throws IOException, SecurityException {
        super();

    }
    protected Cabeceira(OutputStream out) throws IOException {
        super(out);

    }

    protected void writeStreamHeader(){
}}
