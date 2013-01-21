import java.util.Random;
import java.util.Vector;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Baraja {
	Vector<Carta> cartas = new Vector <Carta>();

	/**
	 * 
	 */
	public Baraja() {
		cargarBaraja();
		barajar();
	}
	
	private void cargarBaraja(){
		cartas.add(new Carta("A", "picas", 13));
		cartas.add(new Carta("2", "picas", 2));
		cartas.add(new Carta("3", "picas", 3));
		cartas.add(new Carta("4", "picas", 4));
		cartas.add(new Carta("5", "picas", 5));
		cartas.add(new Carta("6", "picas", 6));
		cartas.add(new Carta("7", "picas", 7));
		cartas.add(new Carta("8", "picas", 8));
		
	}
	/*
	public String barajar(){
		String respuesta = "";
		Random variablex = new Random();
		int x;
		Vector <Integer> usado = new Vector <Integer>();
		boolean usar = true;
		
		for (int y = 0; y < 5; y++) { //inicio del for
			do {
				x = variablex.nextInt(cartas.size());
				usar = true;
						for (int z = 0; z < cartas.size(); z++) {
							if ( z == usado.get(z) && usar == true) {
								usar = true;
							}else{
								usar = false;
							}
						}
				
			}while(usar == false);
		usado.add(x);
			respuesta = usado.get(x).toString();
		}
		return respuesta;
		
	}
	*/
	
	private void barajar () {
		Random aleatorio = new Random();
		Carta cartaTmp;
		int indice = 0;

		for (int i=0;i<cartas.size();i++) {
			// saco un índice aleatorio
			indice = aleatorio.nextInt(cartas.size());
			// SWAP
			cartaTmp = cartas.get(i);
			cartas.set(i, cartas.get(indice));
			cartas.set(indice, cartaTmp);
		}
	}
	
	public void mostrarBaraja(){
		for (int q=0;q<cartas.size();q++)
			System.out.println(cartas.get(q).toString());
	}
	
	
}
