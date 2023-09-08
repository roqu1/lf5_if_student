package weather;

import java.util.Scanner;

public class WeatherUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weather weather = new Weather();
        System.out.print("Bitte geben Sie die Temperatur ein: ");
        double temperatur = scanner.nextDouble();
        String response = weather.evaluateWeather(temperatur);
        System.out.println(response);
    }
}
