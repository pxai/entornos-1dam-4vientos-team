/**
 * 
 */

/**
 * @author Pello
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creamos instancia de un equipo
		Equipo miEquipo = 
				new Equipo("Urroztarra", 1666, 666.66d);

		// Creo un jugador
		Jugador miJugador = 
				new Jugador("Cantona","killer",666);
		
		// Meto un jugador en el vector de jugadores del equipo
		miEquipo.jugadores.add(miJugador);
		
		// Meto un jugador instanciado al vuelo
		miEquipo.jugadores.add(new Jugador("Ronalpinhos","golfo",42));
		
		// Meto un jugador instanciado al vuelo
		miEquipo.jugadores.add(new Jugador("Drenthe","manta",55));
		
		for (Jugador j : miEquipo.jugadores) {
			System.out.println(j.toString());
		}
		
		
	}

}
