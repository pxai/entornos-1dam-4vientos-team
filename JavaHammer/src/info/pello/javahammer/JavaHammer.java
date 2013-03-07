package info.pello.javahammer;

/**
 * JavaHammer
 * Main Class
 * @author Pello Altadill
 *
 */
public class JavaHammer {

	public static void main (String args[]) {
		InputOutput es = new InputOutput();
		Game game = new Game("Battle of Death");
		int test = es.readIntBounds("Gimme a number",0,10);
		/*
		es.msg("you entered " + test);
		es.msg("Current army: " + game.getCurrentArmy().getName());
		es.msg(es.showList(game.getCurrentArmy().getStatus()));
		game.turn();
		es.msg("Current army: " + game.getCurrentArmy().getName());
		*/
		es.msg(game.getBattlefield().show());
		do {

			
			game.turn();
		} while(game.notGameOver());
		es.msg("Thnx for playing JavaHammer");


	}
}
