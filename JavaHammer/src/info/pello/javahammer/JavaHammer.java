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
		//int test = es.readIntBounds("Gimme a number",0,10);
		int option = 0;
		String prayer = "Gods of war I call you\nMy sword is by my side\nI seek a life of honor\nFree from all false pride\n\nI will crack the whip\nWith a bold mighty hail\nCover me with death\nIf I should ever fail\n\nGlory, majesty, unity\nJava, Java, Javaaaa!!!";
		/*
		es.msg("you entered " + test);
		es.msg("Current army: " + game.getCurrentArmy().getName());
		es.msg(es.showList(game.getCurrentArmy().getStatus()));
		game.turn();
		es.msg("Current army: " + game.getCurrentArmy().getName());
		*/
		es.msg(prayer);
		es.msg("\n-=-=-=-=-=-=-=-[ JavaHammer ]-=-=-=-=-=-=-=-\n");
		es.msg(game.getBattlefield().show());
		do {
			option =  es.menu(game.giveOptions(),"Please choose:");
			
			game.turn();
		} while(game.notGameOver());
		es.msg("Thnx for playing JavaHammer");


	}
}
