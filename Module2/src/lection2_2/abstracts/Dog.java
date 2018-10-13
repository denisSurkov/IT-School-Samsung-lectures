package lection2_2.abstracts;

import lection2_2.abstracts.classes.Animal;

public class Dog extends Animal {

    public void eat(){
        System.out.println("собака ест ");
    }

    public void sleep(){
        System.out.println("собака спит");
    }

    public void move(){
        System.out.println("собака передвигается");
    }
}
