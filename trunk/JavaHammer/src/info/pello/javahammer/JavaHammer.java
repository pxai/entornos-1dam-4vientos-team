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
		es.msg(game.getBattlefield().show());
		int test = es.readIntBounds("Gimme a number",0,10);
		es.msg("you entered " + test);
	}
}
