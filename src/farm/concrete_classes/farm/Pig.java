package farm.concrete_classes.farm;

import farm.abstract_classes.farm.Animal;

public class Pig extends Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Oink");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Zzz");
	}

}
