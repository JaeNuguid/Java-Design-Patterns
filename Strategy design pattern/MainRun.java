
public class MainRun {
	
	public static void main(String[] args) {
		
		
		Duck jae = new AmazingDuck();
		Duck nuguid = new NormalDuck();
		Duck rand = new RandomDuck();
		
		System.out.println(jae.getName()+":");
		System.out.println(jae.fly.fly());
		System.out.println(jae.goQuack());

		System.out.println("\n\n"+nuguid.getName()+":");
		System.out.println(nuguid.goFly());
		System.out.println(nuguid.goQuack());

		System.out.println("\n\n"+rand.getName()+":");
		System.out.println(rand.goFly());
		System.out.println(rand.goQuack());
	}

}
