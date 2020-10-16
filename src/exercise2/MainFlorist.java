package exercise2;

public class MainFlorist {
    public static void main(String[] args) {
        Florist florist = new Florist();
        florist.add("Roses");
        florist.add("Sunflower");
        florist.add("Tulip");
        florist.add("Tulip");
        florist.add("Poppy");
        florist.add("Roses");
        florist.add("Orchid");

        System.out.println(florist.getBucket().size());
        System.out.println(florist.getAll());

        florist.remove("Poppy");

        System.out.println(florist.getAll());
        System.out.println(florist.getBucket());
    }
}
