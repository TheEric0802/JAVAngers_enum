package org.example;

import java.util.*;

public class PersonRepository {

    private Map<String, Person> persons = new HashMap<>();

    public List<Person> getPersons() {
        return persons.values().stream().toList();
    }

    public void addPerson(Person person) {
        persons.put(person.id(), person);
    }

    public void removePerson(String id) {
        persons.remove(id);
    }

    public Optional<Person> getPerson(String id) {
        return Optional.ofNullable(persons.get(id));
    }
}
