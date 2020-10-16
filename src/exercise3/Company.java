package exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Person> employees = new ArrayList<>();

    public Person getManager() {
        for (Person person : employees) {
            if (person.getPosition().equalsIgnoreCase("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getPosition().equalsIgnoreCase(profession)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();

        for (Person person : employees) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> result = new ArrayList<>();

        for (Person person : employees) {
            if (person.getName().contains(filterName)) {
                result.add(person);
            }
        }
        return result;
    }

    public void employ(Person person) {
        employees.add(person);
    }
}
