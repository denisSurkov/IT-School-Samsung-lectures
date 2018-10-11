package lection2_1.animals;

public class BasicAnimal {
    protected String name, breed;  // breed - порода
    protected int age, pawCount;
    protected double weight;


    public BasicAnimal(){}

    public BasicAnimal(String name, String breed, int age, int pawCount, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.pawCount = pawCount;
        this.weight = weight;
    }


    public void run(){
        System.out.println("Животное бегает");
    }

    public void eat(){
        System.out.println("Животное ест");
    }

    public void sleep(){
        System.out.println("Животное спит");
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPawCount() {
        return pawCount;
    }

    public void setPawCount(int pawCount) {
        this.pawCount = pawCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "BasicAnimal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", pawCount=" + pawCount +
                ", weight=" + weight +
                '}';
    }



}
