package com.openclassrooms.testing;

public class ConversionCalculator {

	public Double celsiusToFahrenheit(double d) {
		return 	(d * 9/5) + 32;
	}

	public Double fahrenheitToCelsius(double d) {
		return (d - 32) * 5/9;
	}

	public Double litresToGallons(double d) {
		return d/3.78541;
	}

	public Double radiusToAreaOfCircle(double d) {
		final Double PI = 3.14159265358979;
		return PI*d*d;
	}

}
