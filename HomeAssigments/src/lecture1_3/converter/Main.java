package lecture1_3.converter;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        while (a >= 1){
            if ((a >> 1) % 2 == 0){
                System.out.print(0);
            } else {
                System.out.print(1);
            }

            a = a >> 1;
        }
    }

}
