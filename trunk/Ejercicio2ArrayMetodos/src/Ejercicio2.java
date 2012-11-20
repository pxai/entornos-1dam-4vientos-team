/**
 * Saludos
 * La Real arrasó
 */

/**
 * @author pello altadill
 * @version 0.1
 */
public class Ejercicio2 {

	/**
	 * inicializarConNumero
	 * Inicializa con un numero el array
	 * Eneko Moreno 
	 * @param miArray
	 * @param numero
	 */
	public static void inicializarConNumero (int[] miArray, int numero){
	for(int x = 0; x < miArray.length; x++){
		miArray[x]=numero;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] números = new int[15];
		String[] palabras = new String[5];
		palabras[0] = "AMADOR ";
		palabras[1] = "DEL ";
		palabras[2] = "BARCOOOOOOOO ";
		palabras[3] = "PALOMARES ";
		palabras[4] = ", LEOOOOOOOOOOOOOOOON";
		
		for(int x = 0; x < 5; x++){
			System.out.print(palabras[x]);
		}
		System.out.println("Rubén va a suspender todas, que pelao");
	}
}
