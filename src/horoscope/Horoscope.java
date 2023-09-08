package horoscope;

public class Horoscope {
    public String getHoroscope(int day, int month) {
        int firstDayChar = day / 10;
        int secondDayChar = day % 10;
        return getHoroByCharOne(firstDayChar) + getHoroByCharTwo(secondDayChar) + getHoroByMonth(month);
    }

    private String getHoroByCharOne(int firstDayChar) {
        switch (firstDayChar) {
            case 0 -> {
                return "In der Familie ";
            }
            case 1 -> {
                return "In der Partnerschaft ";
            }
            case 2 -> {
                return "Im Berufsleben ";
            }
            case 3 -> {
                return "In der Liebe ";
            }
        }

        return "Etwas Falsch gelaufen";
    }
    private String getHoroByCharTwo(int secondDayChar) {
        switch (secondDayChar) {
            case 0 -> {
                return "fehlt Ihnen die Ausdauer. ";
            }
            case 1 -> {
                return "kündigen sich Veränderungen an. ";
            }
            case 2 -> {
                return "lassen Erfolge auf sich warten. ";
            }
            case 3 -> {
                return "neigen Sie zur Bequemlichkeit. ";
            }
            case 4 -> {
                return "müssen Sie mit unangenehmen Überraschungen rechnen. ";
            }
            case 5 -> {
                return "sind Sie besonders kreativ. ";
            }
            case 6 -> {
                return "befinden Sie sich in einer produktiven Phase. ";
            }
            case 7 -> {
                return "eilen Sie von Erfolg zu Erfolg. ";
            }
            case 8 -> {
                return "kann es zu einer Auseinandersetzung kommen. ";
            }
            case 9 -> {
                return " sind Sie besonders aktiv. ";
            }
        }

        return "Etwas Falsch gelaufen";
    }

    private String getHoroByMonth(int month) {
        switch (month) {
            case 1 -> {
                return "Machen Sie weiter so!";
            }
            case 2 -> {
                return "Lassen Sie sich nicht beeinflussen!";
            }
            case 3 -> {
                return "Hören Sie auf den Rat eines Freundes!";
            }
            case 4 -> {
                return "Werden Sie nicht übermütig!";
            }
            case 5 -> {
                return "Seien Sie weniger kritisch!";
            }
            case 6 -> {
                return "Ab und zu eine Pause einlegen!";
            }
            case 7 -> {
                return "Suchen Sie eine Aussprache!";
            }
            case 8 -> {
                return "Denken Sie nicht nur an sich!";
            }
            case 9 -> {
                return "Nicht immer nur an andere denken!";
            }
            case 10 -> {
                return "Achten Sie auf Ihre Gesundheit!";
            }
            case 11 -> {
                return "Geldausgaben verschieben!";
            }
            case 12 -> {
                return "Idealer Zeitpunkt für einen Neuanfang!";
            }
        }

        return "Etwas Falsch gelaufen";
    }

}
