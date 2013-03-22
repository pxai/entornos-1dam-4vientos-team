package info.pello.javahammer;

/**
 * JavaHammer
 * Main Class of JavaHammer project
 * @author Pello Altadill
 *
 */
public class JavaHammer {

	public static void main (String args[]) {
		InputOutput es = new InputOutput();
		Game game = new Game("Battle of Death");
		int x, y, desX, desY;
		int i = 0;
		String commandResult = "";
		String resultCode = "";
		int option = 0;
		String prayer = "Gods of war I call you\nMy sword is by my side\nI seek a life of honor\nFree from all false pride\n\nI will crack the whip\nWith a bold mighty hail\nCover me with death\nIf I should ever fail\n\nGlory, majesty, unity\nJava, Java, Javaaaa!!!";

		es.msg(prayer);
		es.msg("\n-=-=-=-=-=-=-=-[ JavaHammer ]-=-=-=-=-=-=-=-\n");
		es.msg(game.getBattlefield().show());
		do {
			resultCode = "";
			commandResult = "OK:";
			es.msg( game.getCurrentArmy().getName() + "'s turn ");
			option =  es.menu(game.giveOptions(),"Please choose:");
			switch (option) {
			case 1:
					x = es.readIntBounds("Choose origin row.", 0,game.getBattlefield().MAP_SIZE-1);
					y = es.readIntBounds("Choose origin column.", 0,game.getBattlefield().MAP_SIZE-1);
					desX = es.readIntBounds("Choose destiny row.", 0,game.getBattlefield().MAP_SIZE-1);
					desY = es.readIntBounds("Choose destiny column.", 0,game.getBattlefield().MAP_SIZE-1);
					commandResult = game.move(x,y,desX,desY);
					es.msg(commandResult);
					break;
			case 2:
					x = es.readIntBounds("Choose origin row.", 0,game.getBattlefield().MAP_SIZE-1);
					y = es.readIntBounds("Choose origin column.", 0,game.getBattlefield().MAP_SIZE-1);
					desX = es.readIntBounds("Choose destiny row.", 0,game.getBattlefield().MAP_SIZE-1);
					desY = es.readIntBounds("Choose destiny column.", 0,game.getBattlefield().MAP_SIZE-1);
					commandResult = game.attack(x,y,desX,desY);
					es.msg(commandResult);
					break;
			case 3: es.msg(game.showBattlefield());
					break;
			case 4: 
					es.msg(game.getCurrentArmy().getName() + " army status.");
					es.msg(es.showList(game.getArmyStatus()));
					break;
			case 5:	commandResult = "OK";
					es.msg("Pass, end of " + game.getCurrentArmy().getName() + "'s turn.");
					game.turn();
					break;
			}
			es.msg("Command result: " + commandResult.split(":")[0]);
			if ( commandResult.split(":")[0].equals("OK")) {
				es.removeMenuOption(game.giveOptions(), option);
			} else {
				es.msg("Command failed, try again.");
			}
		} while(game.notGameOver());
		es.msg("Thnx for playing JavaHammer");


	}
}
