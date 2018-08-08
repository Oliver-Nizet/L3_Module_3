package farm.concrete_classes.farm;

import farm.abstract_classes.farm.Animal;

public class Cow extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Moo");
	}

	@Override
	public void sleep() {
		System.out.println("Zzz");
	}

}
