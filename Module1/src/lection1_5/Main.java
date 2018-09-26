package lection1_5;

public class Main {

    public static void main(String[] args){
//        voidDemo();
//        String answer = getString();
//        System.out.println(answer);
//
//
//        System.out.println("Площадь квадрата: " + FigureCalculator.calculateSquare(2));
//        System.out.println("Площадь прямоугольгника: " + FigureCalculator.calculateSquare(1, 2));
//        System.out.println("Площадь круга: " + FigureCalculator.calculateSquare(3d));
        Car car = new Car("Toyota", "Camry", "green");

        car.moveDown();
        car.moveUp();

        car.setColor("red", "балончик");
        System.out.println(car.toString());
        car.setColor("серокакой-то там", "балончик");
        System.out.println(car.toString());
    }

    static void voidDemo(){
        System.out.println("do smth");
    }


    static String getString(){
        return "Just a string";
    }

    static String concat(String a, String b){
        return a + b;
    }

}
