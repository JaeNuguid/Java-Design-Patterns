import java.util.ArrayList;

public interface IObservable {


	public void add(IObserver observer);
	public void remove(String observerName);
	public void notifyObservers();
	
}
