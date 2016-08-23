package cn.wapoint.pattern.facade;

public class FacadePattern {
	private Male male;
	private Female female;

	public FacadePattern(Male male, Female female) {
		this.male = male;
		this.female = female;
	}

	public void doSomething(String type) {
		if (type.equals("male")) {
			male.goSomewhere();
		} else {
			female.eatFood();
		}
	}
}
