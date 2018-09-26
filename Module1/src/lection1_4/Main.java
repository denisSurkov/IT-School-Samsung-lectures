package lection1_4;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        switchDemo();
//        forDemo();

//        for (int i = 0; i < 100; i++) {
//            System.out.println(getRandString(getRandString("1234567890abcdefdgghg/-<>1mS\\", i), i));
//
//        findElement();
//        reverseArray();
//        findMostCommon();
//        averangeInArr();

    }

    private static void findMostCommon(){
        int[] arr = {1, 2, 4, 6, 7, 9, 4, 5, 6, 4, 1, 4};
        int[] arr_copy = arr.clone();
        int numCount = 0, max = 0, indexOfMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]){
                    numCount++;
                }
            }
            arr_copy[i] = numCount;
        }

        for (int i = 0; i < arr_copy.length; i++) {
            if (arr_copy[i] > max){
                max = arr_copy[i];
                indexOfMax = i;
            }
        }

        System.out.println(arr[indexOfMax]);
    }

    private static void averangeInArr(){
        int[] a = {1,2,4,5,6};
        int totalSum = 0;

        for (int i = 0; i < a.length; i++) {
            totalSum += a[i];
        }

        System.out.println(totalSum / a.length);
    }

    private static void reverseArray(){
        int[] arr = {1, 2, 3, 4};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    private static void findElement(){
        int[] arr = {1, 2,3,5,6};
        int el = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el){
                System.out.println(i);
            }
        }
    }

    private static void forDemo(){
        int ARR_SIZE = 10;
        float[] arr = new float[ARR_SIZE];

        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = i;
        }

        System.out.println("average of arr: " + getAverage(arr));
    }
    
    private static void switchDemo(){
        Scanner scan = new Scanner(System.in);

        String userInput = "";

        System.out.println("Times of year");

        while (!userInput.equalsIgnoreCase("exit")){
            System.out.println("Input a month");

            userInput = scan.next();

            System.out.println("Your season: " + getSeasonName(userInput));
        }
    }
    
    private static String getSeasonName(String seasonName) {

        switch (seasonName) { // это switch!
            case "junary":
            case "feb":
            case "dec":
                return "winter is coming";

            case "apr":
            case "may":
            case "mar":
                return "весна is coming";


            case "jul":
            case "jun":
            case "aug":
                return "summer is coming";

            case "sent":
            case "nov":
            case "oct":
                return "осень is coming";

            default:
                return "there is no season for " + seasonName;
        }

    }
    
    private static float getAverage(float... arr){
        float result = 0;
        for (float a : arr) result += a;
        return result / arr.length;
    }   

    private static String getRandString(String key, int size){
        Random random = new Random();
        StringBuilder answer = new StringBuilder();
        char randChar = ' ';

        for (int i = 0; i < size; i++) {
            randChar = key.charAt(random.nextInt(key.length()));
            answer.append(randChar);
        }

        return answer.toString();
    }
}
