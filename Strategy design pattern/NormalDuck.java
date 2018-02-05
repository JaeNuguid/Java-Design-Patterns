
public class NormalDuck extends Duck{


	public NormalDuck() {
		super();
		setQuack(new SimpleQuack());	
		setFly(new SimpleFly());
	}
	
	@Override
	public String getName() {
		return "Normal Duck";
	}
	
	
	
}
