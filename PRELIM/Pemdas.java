import java.util.Scanner;
import java.util.Stack;

public class Pemdas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an equation:(must be separated with a space for example: 1 + 2 * ( 2 + 1 ) ");
        String equation = scanner.nextLine();

        System.out.println("The result of the equation is " + calculateEquation(equation));
    }

    public static double calculateEquation(String equation) {
        // Split the equation into tokens.
        String[] tokens = equation.split(" ");

        // Evaluate the equation using the PEMDAS principle.
        Stack<Character> operators = new Stack<>();
        Stack<Double> operands = new Stack<>();

        for (String token : tokens) {
            if (token.equals("(")) {
                operators.push(token.charAt(0));
            } else if (token.equals(")")) {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    double number2 = operands.pop();
                    double number1 = operands.pop();

                    if (operator == '+') {
                        operands.push(number1 + number2);
                    } else if (operator == '-') {
                        operands.push(number1 - number2);
                    } else if (operator == '*') {
                        operands.push(number1 * number2);
                    } else if (operator == '/') {
                        operands.push(number1 / number2);
                    } else if (operator == '^') {
                        operands.push(Math.pow(number1, number2));
                    }
                }
                operators.pop();
            } else if (token.equals("^")) {
                operators.push(token.charAt(0));
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%")) {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) >= getPrecedence(token.charAt(0))) {
                    char operator = operators.pop();
                    double number2 = operands.pop();
                    double number1 = operands.pop();

                    if (operator == '+') {
                        operands.push(number1 + number2);
                    } else if (operator == '-') {
                        operands.push(number1 - number2);
                    } else if (operator == '*') {
                        operands.push(number1 * number2);
                    } else if (operator == '/') {
                        operands.push(number1 / number2);
                    } else if (operator == '%') {
                        operands.push(number1 % number2);
                    } else if (operator == '^') {
                        operands.push(Math.pow(number1, number2));
                    }
                }
                operators.push(token.charAt(0));
            } else {
                // The token is a number.
                operands.push(Double.parseDouble(token));
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            double number2 = operands.pop();
            double number1 = operands.pop();

            if (operator == '+') {
                operands.push(number1 + number2);
            } else if (operator == '-') {
                operands.push(number1 - number2);
            } else if (operator == '*') {
                operands.push(number1 * number2);
            } else if (operator == '/') {
                operands.push(number1 / number2);
            } else if (operator == '%') {
                operands.push(number1 % number2);
            } else if (operator == '^') {
                operands.push(Math.pow(number1, number2));
            }
        }

        return operands.pop();
    }

    private static int getPrecedence(char operator) {
        if (operator == '^') {
            return 4;
        } else if (operator == '*' || operator == '/' || operator == '%') {
            return 3;
        } else if (operator == '+' || operator == '-') {
            return 2;
        } else {
            return 1;
        }
    }
}