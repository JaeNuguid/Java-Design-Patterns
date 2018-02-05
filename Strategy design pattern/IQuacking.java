
public interface IQuacking {

	String quack();
}

class SimpleQuack implements IQuacking{
	public String quack() {
		return "Simple Quack!!!";
	}
}

class SpecialQuack implements IQuacking{
	public String quack() {
		return "Special Quack!!!";
	}
}


class AmazingQuack implements IQuacking{
	public String quack() {
		return "Amazing Quack!!!";
	}
}
