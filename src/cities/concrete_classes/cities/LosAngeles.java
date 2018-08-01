package cities.concrete_classes.cities;

import cities.abstract_classes.cities.City;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	public double getAnnualTaxes() {
		double t = population * growthRate * 0.5;
		return t;
	}
}