package ud01_03_2_2022;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[0];
		/* Cargamos a lista de clientes: */
		/* se usamos parentesis nos try catch, é o mesmo que usalo con parentesis
		 * agás polo feito de que o que estea entre parentesis, o codigo escrito entre
		 * paretesis indicamos que so o imos usar aqui, e cando remate, xa fai o peche
		 * de recursos automaticamente. 
		 * EXEMPLO:
		 * BufferedWriter writer = null;  
				try {  
    			writer = new BufferedWriter(new FileWriter(fileName));
    			writer.write(str);  // do something with the file we've opened
				} catch (IOException e) {
   				// handle the exception
				} finally {
    		try {
        	if (writer != null)
            writer.close();
    		} catch (IOException e) {
       		// handle the exception
    		}
			}
			FACER TODO O ANTERIOR, ONDE PECHAMOS RECURSOS, É EQUIVALENTE A:
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){  
    		writer.write(str); // do something with the file we've opened
			}
			catch(IOException e){  
    		// handle the exception
			}
		 */
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
			clientes = (Cliente[]) in.readObject();//Lemos obxectos clientes do ficheiro e engadimos no arrai.
		} catch (IOException ex) {
			System.out.println("lista vacía");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
		/* Gestión de clientes: */
		int opcion;
		do {
			System.out.println("1. Engadir cliente");
			System.out.println("2. Baixa de cliente");
			System.out.println("3. Listar clientes");
			System.out.println("4. Sair");
			System.out.print("\nIntroducir opción: ");
			opcion = new Scanner(System.in).nextInt();
			System.out.println("");
			switch (opcion) {
			case 1 -> {
				System.out.print("dni: ");
				String dni = new Scanner(System.in).next();
				System.out.print("nome: ");
				String nombre = new Scanner(System.in).nextLine(); //forzamos o formato da data.
				System.out.print("Data de nacemento (dd-mm-aaaa): ");
				String fNac = new Scanner(System.in).next();
				System.out.print("saldo: ");
				int saldo = new Scanner(System.in).nextInt();
				Cliente nuevo = new Cliente(dni, nombre, fNac, saldo);  //cliente novo
				clientes = Arrays.copyOf(clientes, clientes.length + 1);//método que copia un arrai noutro, 
																		//co segundo parametro indica a lonxitude do novo arrai.
				clientes[clientes.length - 1] = nuevo;//clientes.length indica o tamaño do novo arrai, restamos 1 porque o arrai empeza en 0
				Arrays.sort(clientes);//o metodo sort ordea o arrai clientes.
										// vaino facer xa por dni porque así o definimos na clase clientes
										// cando sobrescribimos o método compareTo
			}

			case 2 -> {
				System.out.print("dni: ");
				String dni = new Scanner(System.in).next();
				Cliente claveBusqueda = new Cliente(dni);
				// Búsqueda secuencial do cliente
				int indice;
				boolean encontrado = false;
				for (indice = 0; indice < clientes.length && !encontrado; indice++) {
					if (clientes[indice].equals(claveBusqueda)) {//equals para comprobar a igualdade de obxectos cliente
						encontrado = true;
					}
				}
				if (encontrado) {
					indice--;// no bucle empezaba en 0, descontamos 1.
					for (int i = indice; i < clientes.length - 1; i++) {
						clientes[i] = clientes[i + 1];
					}
					clientes = Arrays.copyOf(clientes, clientes.length - 1);
				} else {
					System.out.println("Cliente no encontrado");
				}
			}
			case 3 -> {
				System.out.println(Arrays.deepToString(clientes));
				//deepToString devolve a representación de string
				// do contido da matriz de obxectos clientes, a diferenza do método Arrays.toString(), esta devolvería
				//tamen a información se o arrai tivera outros subarrais como subelementos.
				double saldoMax = clientes[0].saldo;
				double saldoMin = clientes[0].saldo;
				double sumaSaldos = 0;
				for (int i = 1; i < clientes.length; i++) {
					if (clientes[i].saldo > saldoMax) {
						saldoMax = clientes[i].saldo;
					}
					if (clientes[i].saldo < saldoMin) {
						saldoMin = clientes[i].saldo;
					}
					sumaSaldos += clientes[i].saldo;
				}
				System.out.println("Saldo máximo: " + saldoMax);
				System.out.println("Saldo mínimo: " + saldoMin);
				System.out.println("Saldo medio: " + sumaSaldos / clientes.length);
			}
			}
		} while (opcion != 4);
		/* Al salir guardamos los datos: */
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.dat"))) {
			out.writeObject(clientes);
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
