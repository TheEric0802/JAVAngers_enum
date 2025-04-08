package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDay(DaysOfWeek.MONDAY));
        System.out.println(getDay(DaysOfWeek.SUNDAY));

        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(new Person("1", "Max", DaysOfWeek.MONDAY));
        personRepository.addPerson(new Person("2", "Maxi", DaysOfWeek.TUESDAY));
        personRepository.addPerson(new Person("3", "Maxim", DaysOfWeek.SUNDAY));

        Optional<Person> testPerson = personRepository.getPerson("1");
        if (testPerson.isPresent()) {
            Person person = testPerson.get();
            System.out.println(person.id());
            System.out.println(person.name());
            System.out.println(person.favoriteDay());
        }

        Optional<Person> testPerson2 = personRepository.getPerson("4");
        if (testPerson2.isPresent()) {
            Person person = testPerson2.get();
            System.out.println(person.id());
            System.out.println(person.name());
            System.out.println(person.favoriteDay());
        }
    }

    public static String getDay(DaysOfWeek day) {
        if (day.isWeekend()) {
            return "Wochenende";
        } else {
            return day.getName();
        }
    }

}