package lecture1_2;

import java.util.Scanner;

class Calculator {
    private static final String HELP_MSG = "\nAvailable operations: " +
            "+; -; /; %; * (multiply); ^ (power); log; sin; cos; acos; ! (factorial) \n";

     void run() {
            Scanner scan = new Scanner(System.in);

            float a, b;
            String action = " ";

            System.out.println("Calculator :) \n");
            System.out.println(HELP_MSG);

            while (!action.equals("exit")) {
                System.out.println("Input first number: ");
                a = scan.nextFloat();

                System.out.println("Input operation: ");
                action = scan.next();

                System.out.println("Input second number (if second num is unneeded just pass 0): ");
                b = scan.nextFloat();

                System.out.println(getResultOfOperation(action, a, b));
            }
        }

    private String getResultOfOperation(String operation, float a, float b){
            float result = 0f;
            String message;
            boolean incorrect = false;

            switch (operation){
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "%":
                    result = a % b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "^":
                    result = Math.round(Math.pow(a, b));
                    break;
                case "!":
                    result = getFactorial(a);
                    break;
                case "log":
                    result = Math.round(Math.log((double) a));
                    break;
                case "sin":
                    result = Math.round(Math.sin((double) a));
                    break;
                case "cos":
                    result = Math.round(Math.cos((double) a));
                    break;
                case "acos":
                    result = Math.round(Math.acos((double) a));
                    break;

                default:
                    incorrect = true;
                    break;
            }

            if (!incorrect) {
                message = "a " + operation + " (b) = " + result;
            } else {
                message = "\tUnknown operation with symbol " + operation + ".\n\tPlease try again.\n\n";
            }

            return message;
        }

    public static float getFactorial(float a){
            if (a <= 0 + Float.MIN_NORMAL || a <= 0 - Float.MIN_NORMAL){
                return 1f;
            }
            return a * (getFactorial(a - 1));
        }
}


