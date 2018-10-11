package lection2_1.animals.dogs;

import lection2_1.animals.BasicAnimal;

public class BasicDog extends BasicAnimal {

    public void hunt(){
        System.out.println("Собака бегает за кошкой");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}
