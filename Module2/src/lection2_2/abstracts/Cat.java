package lection2_2.abstracts;

import lection2_2.abstracts.classes.Animal;

public class Cat extends Animal {

    public void eat(){
        System.out.println("кошка ест ");
    }

    public void sleep(){
        System.out.println("кошка спит");
    }

    public void move(){
        System.out.println("кошка передвигается");
    }

}
