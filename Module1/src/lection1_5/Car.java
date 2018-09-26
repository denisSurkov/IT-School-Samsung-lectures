package lection1_5;

// Модификаторы доступа:

// По степени открытости:
// private (в пределах класса),
// package default (в пределах пакета),
// protected (огранич. пакетом и классы по наследованию),
// public (виден везде)

public class Car {

    private String mark, model, color;

    public String getColor() {
        return color;
    }

    public void setColor(String color, String toolkit) {
        switch (color){
            case "red":
            case "blue":
            case "green":
                if (toolkit.equalsIgnoreCase("балончик")){
                    this.color = color;
                    System.out.println("Машину можно перекрасить в \'" + color + "\' цвет");
                } else {
                    System.out.println("Таким инстурментом нельзя покрасить");
                }

            default:
                System.out.println("Такого цвета не существует");

        }

    }

    Car(String mark, String model, String color){
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    void moveUp(){
        System.out.println("Машина едет вперед");
    }

    void moveDown(){
        System.out.println("Машина едет назад");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
