
public interface IFlying {

	String fly();
}

class SimpleFly implements IFlying{
	public String fly() {
		return "Simple Fly!!!";
	}
}

class SpecialFly implements IFlying{
	public String fly() {
		return "Special Fly!!!";
	}
}


class AmazingFly implements IFlying{
	public String fly() {
		return "Amazing Fly!!!";
	}
}
