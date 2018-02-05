
public class AmazingDuck extends Duck{
	


	public AmazingDuck() {
		super();
		setQuack(new AmazingQuack());	
		setFly(new AmazingFly());
	}

	@Override
	public String getName() {
		return "Amazing Duck";
	}
	
	

}
