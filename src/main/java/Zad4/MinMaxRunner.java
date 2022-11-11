package Zad4;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRunner {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

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


        System.out.println(MinMaxService.getMinMax(integers));
        System.out.println(MinMaxService.getMinMax(stringList));
        System.out.println(MinMaxService.getMinMax(peopleList));
        System.out.println(MinMaxService.getMinMax(carList));


    }
}
