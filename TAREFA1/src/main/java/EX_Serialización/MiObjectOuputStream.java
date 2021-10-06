package EX_Serialización;

import java.io.*;

public class MiObjectOuputStream extends ObjectOutputStream {


    public MiObjectOuputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected MiObjectOuputStream() throws IOException, SecurityException {
        super();
    }

    protected void writeStreamHeader(){

    }
}
