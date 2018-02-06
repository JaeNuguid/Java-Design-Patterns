import java.util.ArrayList;

public interface IObservable {


	ArrayList<IObserver> observers  = new ArrayList<IObserver>();
	
	public void add(IObserver observer);
	public void remove(String observerName);
	public void notifyObservers();
	
}
