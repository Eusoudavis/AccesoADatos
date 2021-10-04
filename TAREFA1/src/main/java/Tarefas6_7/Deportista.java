package Tarefas6_7;

import lombok.Data;

import java.io.Serializable;
@Data
public class Deportista{
    private String nome;
    private int idade;
    private double peso;
    private double estatura;
    private static double mediaIdade;
    private static int sumaIdade;
    private static double mediaPeso;
    private static double sumaPeso;
    private static double mediaEstatura;
    private static double sumaEstatura;
    private static int numDeportistas;

    public Deportista(String nome, int idade, double peso, double estatura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estatura = estatura;
        numDeportistas ++;
    }

    public static void mediaIdade(int idade){
        sumaIdade += idade;
        mediaIdade = sumaIdade /numDeportistas;
    }

    public static void mediaPeso(double peso){
        sumaPeso += peso;
        mediaPeso = sumaPeso/numDeportistas;
    }

    public static void mediaEstatura (double estatura){
        sumaEstatura += estatura;
        mediaEstatura = sumaEstatura /numDeportistas;
    }

    public static int getNumDeportistas() {
        return numDeportistas;
    }

    public static double getMediaPeso() {
        return mediaPeso;
    }

    public static double getMediaIdade() {
        return mediaIdade;
    }

    public static double getMediaEstatura() {
        return mediaEstatura;
    }
}
