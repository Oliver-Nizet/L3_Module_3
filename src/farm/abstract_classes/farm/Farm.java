package farm.abstract_classes.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import farm.concrete_classes.farm.Chicken;
import farm.concrete_classes.farm.Cow;
import farm.concrete_classes.farm.Pig;
import farm.concrete_classes.farm.Sheep;

public class Farm {
	public static void main(String[] args) {
		List<Animal> farm = new ArrayList<Animal>();

		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int ran = r.nextInt(4);
			if (ran == 0) {
				farm.add(i, new Chicken());
			} else if (ran == 1) {
				farm.add(i, new Cow());
			} else if (ran == 2) {
				farm.add(i, new Pig());
			} else if (ran == 3) {
				farm.add(i, new Sheep());
			}
		}
		for (Animal k : farm) {
			k.makeNoise();
			k.sleep();
		}
	}
}
