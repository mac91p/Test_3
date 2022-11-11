package Zad4;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRunner {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        List<String> stringList = new ArrayList<>();

        stringList.add("Ala");
        stringList.add("Bala");
        stringList.add("Zala");
        stringList.add("Dala");

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Jan", "Kowalski"));
        peopleList.add(new Person("Jan", "Wiśniewski"));
        peopleList.add(new Person("Adam", "Kowalski"));
        peopleList.add(new Person("Adam", "Bogacz"));

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "M3", 3999));
        carList.add(new Car("BMW", "M3", 3246));
        carList.add(new Car("BMW", "M8", 4395));
        carList.add(new Car("BMW", "M5", 4395));


        System.out.println(MinMaxService.getMinMax(integerList));
        System.out.println(MinMaxService.getMinMax(stringList));
        System.out.println(MinMaxService.getMinMax(peopleList));
        System.out.println(MinMaxService.getMinMax(carList));


    }
}
