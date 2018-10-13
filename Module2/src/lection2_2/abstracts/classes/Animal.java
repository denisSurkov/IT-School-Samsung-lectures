package lection2_2.abstracts.classes;

public abstract class Animal {
    protected String breed, name;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public void showBaseActions(){
        eat();
        sleep();
        move();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
