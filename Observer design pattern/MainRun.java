

public class MainRun {
	
	public static void main(String[] args) throws InterruptedException {
		
		LottoGame game = new LottoGame();
		
		Player player1 = new Player(game, "Player 1");
		Player player2 = new Player(game, "Player 2");
		Player player3 = new Player(game, "Player 3");
		Player player4 = new Player(game, "Player 4");

		game.add(player1);
		game.add(player2);
		game.add(player3);
		game.add(player4);
		
		// will broadcast 5 results in different times.
		for(int x=0; x<5; x++) {
			
			if(x==3) { // Just for the sake of using the remove() method
				game.remove("Player 3");
			}
			
			game.roll();
			Thread.sleep((long)( Math.random() * 6000));
			game.notifyObservers();
			
		}
		
		System.out.println("\nEND.");
		
	}
	
	

}
