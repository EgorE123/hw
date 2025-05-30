public class Converter {
    private static final double METERS_TO_FOOT = 3.28084;
    private static final double KELVIN = 273.15;
    private static final double POUND = 2.205;

    public static double convertLength(double meter, double foot) {
        return (meter * METERS_TO_FOOT); // метры в футы
    }

    public static double convertLengthCentimetre(double centimetre, double foot, double meter) {
        return (meter / 10 * METERS_TO_FOOT);
    }

    public static double convertTemperature(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Фаренгейт в Цельсий
    }

    public static double convertTemperature(double kelvin, double celsius) {
        return (celsius + KELVIN);
    }

    public static double convertWeight(double kilograms, double pounds) {
        return (kilograms * POUND);
    }

    public static double convertWeight(double grams, double pounds, double kilograms) {
        return (kilograms / 1000 * POUND);
    }


}

