package farm.concrete_classes.farm;

import farm.abstract_classes.farm.Animal;

public class Chicken extends Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Bawk");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Zzz");
	}

}
