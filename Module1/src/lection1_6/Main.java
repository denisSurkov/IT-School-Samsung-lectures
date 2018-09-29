package lection1_6;

// Двумерные массивы

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        mathOperationsWithTwoDimArrDemo();

//        int[][] arr = {{1, 2, 3}, {1, 4, 5}, {10, 11, 12}};
//        swapAnyLineInMatrix(arr, 0, 2);

//        new TicTacToe();
        new SomeAssigments();
    }

    public static void mathOperationsWithTwoDimArrDemo(){
        int[][] arr = {{10, 15, 20}, {13, 12, 18}, {17, 16, 3}};

        mathOperationsWithTwoDimArr(arr, '+');
    }

    public static void mathOperationsWithTwoDimArr(int[][] arr, char operation){
        float result = 0;

        if (operation == '*' || operation == '/')
            result += Float.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int currentNum = arr[i][j];

                if (currentNum > 9 && currentNum < 100 && currentNum % 2 == 0)

                switch (operation){
                    case '+':
                        result += arr[i][j];
                        break;

                    case '*':
                        result -= arr[i][j];
                        break;
                    case '-':
                        result *= arr[i][j];
                        break;

                    case '/':
                        result /= arr[i][j];
                        break;
                }

            }
        }

        System.out.printf("Резултат с операцией %s = %.3f", operation, result);

    }


    public static void twoDimArr(){
        int[] oneDimArr = new int[3];

        int[][] twoDimArr = new int[3][3];
        int[][] twoDimArr2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        int[] currentArr;

        for (int i = 0; i < twoDimArr2.length; i++) {
            currentArr = twoDimArr2[i];
            for (int j = 0; j < currentArr.length; j++) {
                currentArr[j] = j * 2;
                System.out.print(currentArr[j] + " ");

            }
            System.out.print("\n");
        }


        String[][] names = new String[3][3];
        names[0][0] = "Ivan";
        names[0][1] = "Ivanov";
        names[0][2] = "Ivanovich";

        names[1][0] = "Masha";
        names[1][1] = "Ivanova";
        names[1][2] = "Ivanovicha";

        names[2][0] = "Ivan 2";
        names[2][1] = "Ivanoven";
        names[2][2] = "Ivanovich";

        for (String[] user : names) {
            for (String name : user) {
                System.out.print(name + " ");
            }

            System.out.println();
        }
    }


    private static void mainDiagOps(int[][] arr){
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[j].length; j++) {
                if (i == j){
                    if (arr[i][j] < 0){
                        System.out.println("Отрицательное число диагонали: " + arr[i][j]);
                    }
                }

            }

        }
    }


    private static void swapAnyLineInMatrix(int[][] arr, int indexFirstLine, int indexSecondLineToSwap){
        int tmp = 0;


        for (int i = 0; i < arr.length; i++) {

            tmp = arr[indexFirstLine][i];
            arr[indexFirstLine][i] = arr[indexSecondLineToSwap][i];
            arr[indexSecondLineToSwap][i] = tmp;

        }

        printArr(arr);
    }


    private static void printArr(int[]... arr){
        for (int[] i: arr){
            for (int a :
                    i) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

}
