package exercise1;

import java.util.*;

public class Basket {
    private final List<String> fruits = new ArrayList<>();

    public boolean find(String fruitToFind) {
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase(fruitToFind)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String fruit) {
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(fruit)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Set<String> distinct() {
        return new HashSet<>(fruits);
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int count = 0;

        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

    public List<String> getFruits() {
        return fruits;
    }
}
