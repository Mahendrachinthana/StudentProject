package oopPractice;

public class A implements Person ,Behaviour {

	@Override
	public String Good() {
		return "Good Behaviour";
	}

	@Override
	public String Bad() {
		return "Irritating Behaviour";
	}

	@Override
	public String Smile() {
		return "Can Smile";
	}

	@Override
	public String Walk() {
		return "Can Walk";
	}

	@Override
	public int Weight() {
		return 52;
	}

}
