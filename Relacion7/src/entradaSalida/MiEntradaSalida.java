package entradaSalida;
import java.util.Scanner;

public class MiEntradaSalida {
	
	private static final String SI = "S";
	private static final String NO = "N";
	
	private static Scanner teclado = new Scanner(System.in);
	
	/**
	 * M�todo que solicita un n�mero entero por teclado.
	 * Si el dato no es entero vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra 
	 * antes de pedir el entero
	 * @return El entero introducido por teclado
	 */
	public static int solicitarEntero (String mensaje) {
		int numero = 0;
		boolean error;
		
		do {
			try {
				System.out.println(mensaje);
				numero = Integer.parseInt(teclado.nextLine());
				error = false;
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error==true);
		
		return numero;
	}
	
	/**
	 * M�todo que solicita un entero mayor o igual a 0.
	 * Si es dato no es positivo o cero vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra 
	 * antes de pedir el entero positivo
	 * @return El entero introducido por teclado
	 */
	public static int solicitarEnteroPositivo (String mensaje) {
		int numero = 0;
		boolean error = true;
		
		do {
			try {
				System.out.println(mensaje);
				numero = Integer.parseInt(teclado.nextLine());
				if (numero < 0) {
					System.out.println("El dato debe ser positivo");
					error=true;
				}
				else{
					error = false;
				}
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error );
		
		return numero;
	}
	
	/**
	 * M�todo que solicita un entero en el rango que queramos.
	 * Si no est� en el rango vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra antes de pedir
	 * el n�mero entero.
	 * @param limiteInf int con el l�mite inferior
	 * @param limiteSup int con el l�mite superior
	 * @return int introducido por teclado, dentro del l�mite deseado
	 */
	public static int solcitarEnteroEnRango (String mensaje, int limiteInf, int limiteSup) {
		int numero = 0;
		int aux;
		boolean error = true;
		
		if (limiteInf > limiteSup) {
			aux = limiteSup;
			limiteSup = limiteInf;
			limiteInf = aux;
		}
		
		do {
			try {
				System.out.println(mensaje +"["+limiteInf+"-"+limiteSup+"]");
				numero = Integer.parseInt(teclado.nextLine());
				if (numero < limiteInf || numero > limiteSup) {
					System.out.println("N�mero fuera de rango");
					error = true;
				} else {
					error = false;
				}
				
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error);
		
		return numero;
	}
	
	/**
	 * M�todo que solicita un car�cter por teclado.
	 * Si el dato introducido no es un car�cter vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra antes de pedir el car�cter
	 * @return char con el car�cter introducido
	 */
	public static char solicitarCaracter (String mensaje) {
		char c = 0;
		String cadena;
		boolean error = true;
		
		do {

			System.out.println(mensaje);
			cadena = teclado.nextLine();
			error = false;

			if (cadena.length() != 1) {
				error = true;
				System.out.println("Error de formato");
			} else {
				c = cadena.charAt(0);
			}
			
		} while (error);
		
		return c;
	}
	
	/**
	 * M�todo que solicita un car�cter S o N, y lo vuelve
	 * a pedir si este no es ni S ni N lo vuelve a pedir
	 * @param mensaje String con el mensaje que se muestra antes de
	 * pedir el car�cter
	 * @return El car�cter introducido por teclado
	 */
	public static char solicitarCaracterSN (String mensaje) {
		char c = 0;
		String cadena;
		boolean error = false;
		
		do {

			System.out.println(mensaje);
			cadena = teclado.nextLine();


			if (!(cadena.equalsIgnoreCase(SI) || cadena.equalsIgnoreCase(NO))) {
				error = true;
				System.out.println("Error de formato");
			} else {
				
				c = cadena.charAt(0);
				error = false;
			}
			
		} while (error);
		
		return c;
	}
	
	/**
	 * M�todo que solicita un String y comprueba que este no est� vacio.
	 * @param mensaje String con el mensaje que se muestra por 
	 * pantalla antes de solicitar la cadena
	 * @return String el cual hemos introducido por teclado
	 */
	public static String solicitarCadena (String mensaje) {
		String cadena;
		
		do {
			System.out.println(mensaje);
			cadena = teclado.nextLine();
		} while (cadena.length() == 0);
		return cadena;
	}

}
