package exercise1;

public class MainBasket {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruit("orange");
        basket.addFruit("kiwi");
        basket.addFruit("banana");
        basket.addFruit("strawberry");
        basket.addFruit("grapes");
        basket.addFruit("kiwi");
        basket.addFruit("apple");

        System.out.println(basket.getFruits());
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.distinct());
        System.out.println(basket.find("strawberry"));
        System.out.println(basket.find("mango"));
        System.out.println(basket.position("strawberry"));
        System.out.println(basket.remove("banana"));
        System.out.println(basket.getFruits());
    }
}
