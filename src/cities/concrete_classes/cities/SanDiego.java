package cities.concrete_classes.cities;

import cities.abstract_classes.cities.City;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);

	}

	public double getAnnualTaxes() {
		double t = population * growthRate + 1000000;
		return t;
	}
}
