
public class Duck{

	public IFlying fly;
	public IQuacking quack;


	public String goFly() {
		return fly.fly();
	}
	
	public String goQuack() {
		return quack.quack();
	}
	

	public void setFly(IFlying fly) {
		this.fly = fly;
	}
	
	public void setQuack(IQuacking quack) {
		this.quack = quack;
	}

	public String getName() {
		return "Clean Duck";
	}
	
}
