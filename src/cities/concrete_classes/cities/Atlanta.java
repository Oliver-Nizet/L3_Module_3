package cities.concrete_classes.cities;

import cities.abstract_classes.cities.City;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);

	}

	public double getAnnualTaxes() {
		double t = population * growthRate * 2;
		return t;
	}
}