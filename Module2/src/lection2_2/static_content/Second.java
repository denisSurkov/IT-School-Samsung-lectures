package lection2_2.static_content;

public class Second {
    public int a;
    public static int b;


    public Second(){
        a++;
        b++;
        System.out.printf("a:%d, b:%d %n", a, b);
    }

}
