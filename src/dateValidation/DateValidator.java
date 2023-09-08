package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return false;
        }
            return true;



    }
}
