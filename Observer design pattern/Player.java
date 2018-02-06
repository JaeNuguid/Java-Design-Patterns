import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Player implements IObserver {

	String playerName;
	LottoGame game;
	String date;
	
	public Player(LottoGame game, String playerName) {
		this.playerName = playerName;
		this.game = game;
		
		System.out.println(playerName+" added.");
	}
	
	
	// Prints out the current date, player name, and the received data
	@Override
	public void update() {
		date = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(date+" | "+playerName+" received -> "+game.getResult());
	}
	
	public String getPlayerName() {
		return playerName;
	}

}
