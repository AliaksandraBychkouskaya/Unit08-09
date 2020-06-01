package by.tr.mod8;

public class CounterTest {
    public static void main(String[] args) {
        Counter my = new Counter(0,10,5);
        Counter rand = new Counter (0,10);
        System.out.println("Initial value of the first counter = "+ my.current_value);
        System.out.println("Initial value of the second counter = "+ rand.current_value);

        my.decreaseCounter();
        System.out.println("Decreased value of the first counter = " + my.current_value);
        rand.increaseCounter();
        System.out.println("Increased value of the second counter = " + rand.current_value);
    }
}
