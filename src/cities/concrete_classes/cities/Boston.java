package cities.concrete_classes.cities;

import cities.abstract_classes.cities.City;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);

	}

	public double getAnnualTaxes() {
		double t = (population * 0.5) + (population * growthRate);
		return t;
	}
}