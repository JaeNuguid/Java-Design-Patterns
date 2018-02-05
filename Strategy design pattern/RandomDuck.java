import java.util.Random;

public class RandomDuck extends Duck{

	IFlying flys[] = {new SimpleFly(), new SpecialFly(),new AmazingFly()};
	IQuacking quacks[] = {new SimpleQuack(), new SpecialQuack(),new AmazingQuack()};
	
	public RandomDuck() {
		super();
		Random rand = new Random();
		int f = rand.nextInt(3);
		int q =f;
		while(q==f)
		 q= rand.nextInt(3);
		
		setFly(flys[f]);
		setQuack(quacks[q]);
		
	}
	

	@Override
	public String getName() {
		return "Random Duck";
	}
	
	
}
