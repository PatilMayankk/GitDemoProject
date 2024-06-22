package noDefault;

interface LivingBeing {
	void walk();
}

class Rabbit implements LivingBeing {
	public void walk() {
		System.out.println("Rabbit is walking");
	}
}

public class Animal {

	public static void main(String[] args) {

		Rabbit r = new Rabbit();
		r.walk();

	}
}
