package calculator;

public class Calculator {

    public String calculateIfElse(double number1, double number2, char operator) {
        double result;
        if (operator  == '+') {
            result = number1 + number2;
        } else if (operator  == '-') {
            result = number1 - number2;
        } else if (operator  == '*') {
            result = number1 * number2;
            operator= 'x';
        } else if (operator  == '/') {
            if (number2 == 0) {
                return "Division durch 0 nicht möglich!";
            }
            result = number1 / number2;
            operator= ':';
        } else {
            return "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
        }
        return number1 + " " + operator + " " + number2 + " = " + result;
    }

    public String calculateSwitchCase(double number1, double number2, char operator) {
        
        double result;
        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> {
                result = number1 * number2;
                operator = 'x';
            }
            case '/' -> {
                if (number2 == 0) {
                    return "Division durch 0 nicht möglich!";
                }
                result = number1 / number2;
                operator = ':';
            }
            default -> {
                return "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
            }
        }
        return number1 + " " + operator + " " + number2 + " = " + result;
    }

}

