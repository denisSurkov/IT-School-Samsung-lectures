package lection1_5;

public class FigureCalculator {


    FigureCalculator(){
        this(5); // Вызов конструктора ниже (парам. по умолчанию)
        int a = 5, b = 10;

    }

    FigureCalculator(int a){

    }

    public static int calculateSquare(int a){
        return a * a;
    }


    public static int calculateSquare(int a, int b) {
        return a * b;
    }


    public static double calculateSquare(double r){
        return Math.PI * (r * r);
    }
}