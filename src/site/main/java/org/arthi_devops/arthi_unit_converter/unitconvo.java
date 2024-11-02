package org.arthi_devops.arthi_unit_converter;

public class unitconvo {

    // Length Conversions
    public static double feetToMeter(double feet) { return feet * 0.3048; }
    public static double meterToFeet(double meters) { return meters / 0.3048; }
    public static double feetToInch(double feet) { return feet * 12; }
    public static double inchToFeet(double inches) { return inches / 12; }
    public static double feetToMile(double feet) { return feet / 5280; }
    public static double mileToFeet(double miles) { return miles * 5280; }
    public static double feetToYard(double feet) { return feet / 3; }
    public static double yardToFeet(double yards) { return yards * 3; }
    public static double meterToInch(double meters) { return meters * 39.3701; }
    public static double inchToMeter(double inches) { return inches / 39.3701; }
    public static double meterToMile(double meters) { return meters / 1609.34; }
    public static double mileToMeter(double miles) { return miles * 1609.34; }
    public static double meterToYard(double meters) { return meters * 1.09361; }
    public static double yardToMeter(double yards) { return yards / 1.09361; }
    public static double inchToMile(double inches) { return inches / 63360; }
    public static double mileToInch(double miles) { return miles * 63360; }
    public static double inchToYard(double inches) { return inches / 36; }
    public static double yardToInch(double yards) { return yards * 36; }

    // Weight Conversions
    public static double gramToPound(double grams) { return grams / 453.592; }
    public static double poundToGram(double pounds) { return pounds * 453.592; }
    public static double gramToOunce(double grams) { return grams / 28.3495; }
    public static double ounceToGram(double ounces) { return ounces * 28.3495; }
    public static double gramToCarat(double grams) { return grams * 5; }
    public static double caratToGram(double carats) { return carats / 5; }
    public static double poundToOunce(double pounds) { return pounds * 16; }
    public static double ounceToPound(double ounces) { return ounces / 16; }
    public static double poundToCarat(double pounds) { return pounds * 2267.96; }
    public static double caratToPound(double carats) { return carats / 2267.96; }
    public static double ounceToCarat(double ounces) { return ounces * 141.748; }
    public static double caratToOunce(double carats) { return carats / 141.748; }

    // Temperature Conversions
    public static double celsiusToKelvin(double celsius) { return celsius + 273.15; }
    public static double kelvinToCelsius(double kelvin) { return kelvin - 273.15; }
    public static double celsiusToFahrenheit(double celsius) { return (celsius * 9/5) + 32; }
    public static double fahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5/9; }
    public static double kelvinToFahrenheit(double kelvin) { return (kelvin - 273.15) * 9/5 + 32; }
    public static double fahrenheitToKelvin(double fahrenheit) { return (fahrenheit - 32) * 5/9 + 273.15; }
}

