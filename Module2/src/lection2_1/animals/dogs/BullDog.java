package lection2_1.animals.dogs;

public class BullDog extends BasicDog {

    public void secure(){
        System.out.println("Охраняю дом!!");
    }

    @Override
    public void eat() {
        System.out.println("Бульдог ест собачий корм");
    }

}
