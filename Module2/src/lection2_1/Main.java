package lection2_1;

import lection2_1.animals.BasicAnimal;
import lection2_1.animals.dogs.BasicDog;
import lection2_1.animals.dogs.BullDog;
import lection2_1.incapsulation_demo.Phone;

/**
 * Объектно-ориентированное программирование.
 *
 * 3 кита: наследование, полиморфизм, инкапсуляция
 *
 */

public class Main {

    public static void main(String[] args) {
        BasicAnimal animal = new BasicAnimal();
        BasicDog dog = new BasicDog();
        BullDog bullDog = new BullDog();

        animal.eat();
        dog.eat();
        bullDog.eat();
    }

}
