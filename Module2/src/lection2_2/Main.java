package lection2_2;

import lection2_2.abstracts.Cat;
import lection2_2.abstracts.Dog;
import lection2_2.abstracts.classes.Animal;
import lection2_2.interfaces.Controller;
import lection2_2.interfaces.Human;
import lection2_2.interfaces.Televisor;
import lection2_2.interfaces.Xbox;
import lection2_2.static_content.CustomMath;
import lection2_2.static_content.Second;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        smth();

        new Second();
        new Second();
        new Second();
        new Second();

        System.out.println(CustomMath.sum(5, 5));

        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.showBaseActions();
        cat.showBaseActions();

        new Human(new Televisor());
        new Human(new Xbox());

        // no JFrame example here ;)

    }

    static void smth(){
        System.out.println("doing smth");
    }
}
