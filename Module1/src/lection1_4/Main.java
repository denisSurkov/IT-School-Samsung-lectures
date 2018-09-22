package lection1_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = "";

        System.out.println("Times of year");

        while (!userInput.equalsIgnoreCase("exit")){
            System.out.println("Input a month");

            userInput = scan.next();

            System.out.println("Your season: " + getSeasonName(userInput));
        }
    }


    private static String getSeasonName(String seasonName){

        switch (seasonName){ // это switch!
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


}
