package lection1_6;

public class SomeAssigments {

    SomeAssigments(){
        findNumOnDigOnMatrix();

        findNumOnDigOnMatrixOnLinesEvenOrOdd();

        findNumOnDigOnMatrixOnColsEvenOrOdd();

    }

    private static void findNumOnDigOnMatrix(){
        int tmp = Integer.MIN_VALUE;
        int[][] arr = {{1, 2, 222}, {1, 10, 222231}, {1, 13, 222}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] > tmp) {
                        tmp = arr[i][j];
                    }
                }
            }
        }

        System.out.printf("Максимальное число: %d %n", tmp);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] < tmp) {
                        tmp = arr[i][j];
                    }
                }
            }
        }

        System.out.printf("Минимальное число: %d %n", tmp);

    }

    private static void findNumOnDigOnMatrixOnLinesEvenOrOdd(){
        int tmp = Integer.MIN_VALUE;
        int[][] arr = {{0, 2, 887}, {1, 10, 2}, {1, 13, 222}};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > tmp)
                        tmp = arr[i][j];
                }
            }
        }

        System.out.printf("Максимальное число на четных строках: %d %n", tmp);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] < tmp)
                        tmp = arr[i][j];
                }
            }
        }

        System.out.printf("Минимальное число на четных строках: %d %n", tmp);
    }




    private static void findNumOnDigOnMatrixOnColsEvenOrOdd(){
        int tmp = Integer.MIN_VALUE;
        int[][] arr = {{0, 100000, 887}, {1, 10, 2}, {1, 13, 222}};

        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j % 2 == 0&& arr[i][j] > tmp)
                        tmp = arr[i][j];
            }
        }

        System.out.printf("Максимальное число на нечетных столбцах: %d %n", tmp);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0&& arr[i][j] < tmp)
                    tmp = arr[i][j];
            }
        }

        System.out.printf("Минимальное число на нечетных столбцах: %d %n", tmp);
    }





}
