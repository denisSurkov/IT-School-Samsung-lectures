package lection1_2;

import java.util.Scanner;

/**
 * Created by USER on 15.09.2018.
 */
public class Calculator {

    Calculator() {
        float a, b;
        String action = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("calculator");
        while (!action.equals("exit")) {
            System.out.println("input first num");
            a = scanner.nextFloat();
            System.out.println("input second num");
            b = scanner.nextFloat();
            System.out.println("input action");
            action = scanner.next();
            switch (action) {
                case "+":
                    System.out.println("a + b = " + (a + b));
                    break;
                case "-":
                    System.out.println("a - b = " + (a - b));
                    break;
                case "*":
                    System.out.println("a * b = " + (a * b));
                    break;
                case "/":
                    System.out.println("a / b = " + (a / b));
                    break;
                default:
                    System.out.println("action not found");
                    break;
            }
        }
    }
}
