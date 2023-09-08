package gradesWithIHKScheme;

public class GradeCalculator {
    public int calculateGrade(double points, int reachablePoints){
        double percentage = points / reachablePoints * 100;
        percentage = Math.round(percentage);
        if(percentage >= 0 && percentage <= 29){
            return 6;
        }
        if(percentage >= 30 && percentage <= 49){
            return 5;
        }
        if(percentage >= 50 && percentage <= 66){
            return 4;
        }
        if(percentage >= 67 && percentage <= 80){
            return 3;
        }
        if(percentage >= 81 && percentage <= 91){
            return 2;
        }
        if(percentage >= 92 && percentage <= 100) {
            return 1;
        }

        return -1;
    }
}