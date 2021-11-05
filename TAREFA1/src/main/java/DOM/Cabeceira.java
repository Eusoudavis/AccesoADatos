package DOM;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Cabeceira extends ObjectOutputStream {
    public Cabeceira(OutputStream out) throws IOException {
        super(out);
    }

    protected Cabeceira() throws IOException, SecurityException {
        super();
    }

    protected void writeStreamHeader(){

    }
}
