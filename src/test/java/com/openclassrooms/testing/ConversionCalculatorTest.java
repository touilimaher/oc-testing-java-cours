package com.openclassrooms.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ConversionTests") // (1)
@DisplayName("Réussir à convertir entre différentes unités.") // (2)
public class ConversionCalculatorTest {

	private static final Double PI = 3.14159265358979;
	private ConversionCalculator calculatorUnderTest = new ConversionCalculator();

	@Nested // (3)
	@Tag("TemperatureTests") // (4)
	@DisplayName("Réussir à convertir des températures") // (4)
	class TemperatureTests {
		@Test
		@DisplayName("Soit une T° à 0°C, lorsque l'on convertit en °F, alors on obtient 32°F.")
		public void celsiusToFahrenheit_returnsAFahrenheitTempurature_whenCelsiusIsZero() {
			Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0);
			System.out.println("actualFahrenheit : " + actualFahrenheit);
			assertThat(actualFahrenheit).isCloseTo(32.0, withinPercentage(0.01));
		}

		@Test
		@DisplayName("Soit une T° à 32°F, lorsque l'on convertit en °C, alors on obtient 0°C.")
		public void fahrenheitToCelsius_returnsZeroCelciusTempurature_whenThirtyTwo() {
			Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
			System.out.println("actualCelsius : " + actualCelsius);
			assertThat(actualCelsius).isCloseTo(0.0, withinPercentage(0.01));
		}
	}

	@Test
	@DisplayName("Soit un volume de 3.78541 litres, en gallons, on obtient 1 gallon.")
	public void litresToGallons_returnsOneGallon_whenConvertingTheEquivalentLitres() {
		Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
		System.out.println("actualLitres : " + actualLitres);
		assertThat(actualLitres).isCloseTo(1.0, withinPercentage(0.01));
	}

	@Test
	@DisplayName("L'aire d'un disque de rayon 1 doit valoir PI.")
	public void radiusToAreaOfCircle_returnsPi_whenWeHaveARadiusOfOne() {
		Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
		System.out.println("actualArea : " + actualArea);
		assertThat(actualArea).isCloseTo(PI, withinPercentage(0.01));
	}
}
