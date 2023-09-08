package weather;

public class Weather {
    public String evaluateWeather(double temperature) {
        String response;
        if (temperature >22) {
            response = "Heute ist ein schöner Tag!";
        } else {
             response = "Heute ist nicht so schön";
        }
        return response;
    }
}
