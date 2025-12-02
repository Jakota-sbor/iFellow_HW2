package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Toyota("Camry", 2005, "автоматическая", "черный", 167));
        cars.add(new Toyota("Corolla", 2010, "автоматическая", "зеленый", 132));
        cars.add(new KIA("Rio", 2008, "ручная", "белый", 123));
        cars.add(new KIA("Sportage", 2003, "автоматическая", "зеленый", 150));
        cars.add(new BMW("X5", 2015, "ручная", "синий", 306));
        cars.add(new BMW("X3", 2004, "ручная", "зеленый", 204));
        cars.add(new Audi("A4", 2012, "автоматическая", "красный", 170));
        cars.add(new Audi("A6", 2006, "ручная", "зеленый", 192));
        cars.add(new Suzuki("Swift", 2009, "ручная", "черный", 90));
        cars.add(new Suzuki("Vitara", 2002, "ручная", "белый", 110));

        printCarsWithYearAfter2006(cars);
        changeColorToRed(cars);
        printAutoCars(cars);
    }

    // Выводит информацию об автомобилях, выпущенных после 2006 года,
    // иначе вывести надпись «устаревший авто»
    public static void printCarsWithYearAfter2006(List<Car> cars) {
        for (Car car : cars) {
            if (car.year > 2006)
                System.out.println(car.getFullInfo());
            else
                System.out.println("устаревший авто");
        }
    }

    //Изменяет цвет авто на красный, если у авто зеленый цвет.
    public static void changeColorToRed(List<Car> cars) {
        for (Car c : cars) {
            if (c.color.equalsIgnoreCase("зеленый"))
                c.setColor("красный");
        }
    }

    // Выводит информацию только об автомобилях с автоматической коробкой передач
    public static void printAutoCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.transmission.equalsIgnoreCase("автоматическая"))
                System.out.println(car.getFullInfo());
        }
    }
}
