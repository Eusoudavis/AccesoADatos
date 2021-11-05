package ud01_03_2_2022;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Objects;

public class Cliente implements Serializable, Comparable {
	//comparable conten un método abstracto compareTo que permite ordear un obxecto
	//segundo un atributo especificado (String, Double....) nun orden ascendente ou descendente.
	private static final long serialVersionUID = 1L;

    final String dni;//o dni é inmutable
    String nombre;
    LocalDate fechaNacimiento;
    double saldo;

    public Cliente(String dni) {
        this.dni = dni;
    }

    public Cliente(String dni, String nombre, String fNac, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");//damos formato a data.
        fechaNacimiento = LocalDate.parse(fNac, formato);//usamos o formato anterior para a data de nacemento.
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
        //calcula a diferenza entre duas datas, tamen se pode usar DAYS.Between... ou outras.
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) { //obteño a clase da que veñen os obxectos, se son distintas, devolvo false.
            return false;
        }
        
        final Cliente other = (Cliente) obj;  //creamos o cliente other para comparacion posterior
        
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    /*Orden natural basado no dni*/
      @Override
    public int compareTo(Object o) {
        return dni.compareTo(((Cliente) o).dni);
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre
                + ", saldo=" + saldo + ", edad=" + edad()
                + "}\n";
    }


}
