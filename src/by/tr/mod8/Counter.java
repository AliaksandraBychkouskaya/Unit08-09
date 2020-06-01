package by.tr.mod8;

import java.util.Random;

public class Counter {
    public int min_value;
    public int max_value;
    public int current_value;
    public Counter( int min, int max, int current){
        min_value = min;
        max_value = max;
        current_value = current;
    }
    public Counter( int min, int max){
        min_value = min;
        max_value = max;
        current_value = this.min_value + (int)(Math.random()*(this.max_value - this.min_value + 1));
    }
    public int getCurrent_value() {
        return current_value;
    }

    public void increaseCounter() {
        if (current_value < max_value)
            current_value++;
    }
    public void decreaseCounter() {
        if (current_value > min_value)
            current_value--;
    }
}
