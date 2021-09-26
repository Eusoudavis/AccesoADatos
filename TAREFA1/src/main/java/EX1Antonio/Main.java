package EX1Antonio;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<ParaTodasCidades> creacion = new ArrayList<ParaTodasCidades>();


        Polideportivo polideportivoFornelos = new Polideportivo("FornelosPoli",
            "AsPias", "Polideportivo", 500000);

        creacion.add(polideportivoFornelos);

        Oficina oficinaFornelos = new Oficina("OficinaSil", "Fornelos", 10000);
        creacion.add(oficinaFornelos);

        int vecesOficina = 0;
        int vecesPoli = 0;

        
        /* Iterator<ParaTodasCidades> it = creacion.iterator();
        while (it.hasNext()){
            if()
        }*/
    System.out.println(polideportivoFornelos);
    }
}
