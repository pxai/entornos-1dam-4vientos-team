import java.util.Random;

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
	/**
	 * Mostrar array de benjamin
	 * @param miArray
	 */
	public static void mostrar (int[] miArray)
	{
		for(int y =0; y<miArray.length; y++){
		System.out.println(miArray[y]);
			
		}
	}
	/**
	 * inicializarAleatorio
	 * inicializa con numeros aleatorios el array
	 * Mikel pardo
	 * @param miArray
	 */
	public static void inicializarAleatorio (int[] miArray)
	{
		Random aleatorio = new Random();
		
		for(int z=0; z<miArray.length; z++)
		{
			miArray[z]=aleatorio.nextInt(11);
		}
	}
	/**
	 * aleatorio
	 * coge de un grupo de numeros random un numero al azar, gracias al return.
	 * @param miArray
	 * @return
	 */
	
	public static int aleatorio(int[] miArray){
	Random aleatorio = new Random();
	int numero = aleatorio.nextInt(miArray.length) ;
	return miArray[numero];
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

