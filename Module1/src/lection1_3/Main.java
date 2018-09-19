package lection1_3;

public class Main {

    public static void main(String[] args) {
        logicOpsDemo();
        bitshiftRigthDemo();
        bitShiftLeftDemo();
        boolOperationsDemo();
    }

    private static void logicOpsDemo() {
        System.out.println("and (&) demo");
        System.out.printf("4&5dec: %s%n",Integer.toBinaryString(4&5));


        System.out.println("or (|) demo");
        System.out.printf("4|5: %d%n", 4|5);
        System.out.printf("4|5dec: %s%n",Integer.toBinaryString(4|5));


        System.out.println("~  demo");
        System.out.printf("~4 %d%n", ~4);
        System.out.printf("~4: %s%n",Integer.toBinaryString(~4));

    }

    private static void bitshiftRigthDemo(){
        System.out.println("shift right bit");
        int a = 1024;

        for (int i = 0; i < 10; i++) {
            int b = a >> 1;
            System.out.println("shift right (divide 2): ");
            System.out.println("a: " + Integer.toBinaryString(a));
            System.out.println("b: " + Integer.toBinaryString(b));
            System.out.println("a decimal: " + a);
            a = b;
        }

    }

    private static void bitShiftLeftDemo(){
        System.out.println("shift left bit");
        int a = 2;

        for (int i = 0; i < 10; i++) {
            int b = a << 1;
            System.out.println("shift left (multiply 2): ");
            System.out.println("a: " + Integer.toBinaryString(a));
            System.out.println("b: " + Integer.toBinaryString(b));
            System.out.println("a decimal: " + a);
            a = b;
        }

    }

    private static void boolOperationsDemo(){
        System.out.println("testing operators like &&, ||, ^");

        String surname = "Ivanov";
        String name = "Petrov";

        if (surname.equalsIgnoreCase("ivanov") && name.equalsIgnoreCase("petrov")){
            System.out.println("names are correct with and operator");
        } else {
            System.out.println("names are incorrect");
        }


        if (s1() == 1 || s2() == 2){
            System.out.println("hi");
        }

    }

    private static int s1 (){
        System.out.println("hi1");
        return 1;
    }

    private static int s2 (){
        System.out.println("hi2");
        return 2;
    }

    private boolean isInLine(int x, int a, int b){
        return (a <= x) && (x <= b);
    }

    private boolean isInLine2(int x, int a, int b, int c, int d){
        return isInLine(x, a, b) || isInLine(x, c, d);
    }

    private boolean isInLine3(int x, int a, int b, int c, int d) {
        return !isInLine(x, a, b) && !isInLine(x, c, d);
    }


    private boolean isOdd(int x){
        return x % 2 == 1;
    }

    private boolean isEven(int x){
        return x % 2 == 0;
    }

    private boolean isMul5(int x){
        return (x >= 100) && (x % 5 == 0);
    }

    private String converter2(int x){
        return "" + (x >>> 1);
    }

}
