package exercise2;

import java.util.HashSet;
import java.util.Set;

public class Florist {
    private Set<String> bucket = new HashSet<>();

    public Set<String> getAll() {
        return new HashSet<String>(bucket);
    }

    public void add(String flower) {
        bucket.add(flower);
    }

    public void remove(String flower) {
        bucket.remove(flower);
    }

    public Set<String> getBucket() {
        return bucket;
    }
}
