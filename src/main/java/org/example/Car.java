package org.example;

public abstract class Car {
    protected String model;
    protected String brand;
    protected int year;
    protected String transmission;
    protected String color;
    protected int enginePower;

    public Car(String model, String brand, int year, String transmission, String color, int enginePower) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.transmission = transmission;
        this.color = color;
        this.enginePower = enginePower;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getFullInfo() {
        return String.format(
                "Бренд: %s, модель: %s, год выпуска: %d, тип коробки передач: %s, цвет: %s, мощность двигателя: %d",
                brand, model, year, transmission, color, enginePower
        );
    }
}
