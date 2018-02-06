import java.util.ArrayList;
import java.util.Random;

public class LottoGame implements IObservable {
	ArrayList<IObserver> Players = new ArrayList<IObserver>();
	String result="";
	
	@Override
	public void add(IObserver observer) {
		// TODO Auto-generated method stub
		Players.add(observer);
	}

	@Override
	public void remove(String observerName) {
		// TODO Auto-generated method stub
		for(int x=0;x<Players.size();x++) {
			Player player = (Player)Players.get(x);
			if(player.getPlayerName().equals(observerName)) {

				System.out.println(player.playerName+" removed.");
				Players.remove(x);
			}
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(IObserver x:Players) {
			x.update();
		}
		
		System.out.println("\n"); 
		
	}
	

	// Generates a random result
	// An example of data to be broadcasted
	public void roll() {
		
		Random rand = new Random();
		result ="";
		for(int x=0; x< 6;x++)
			result+= rand.nextInt(10);
	}
	
	
	public String getResult() {
		return result;
	}

	
	
}
