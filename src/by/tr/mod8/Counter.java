package by.tr.mod8;// следите за правильным количеством уровней в пакетах
// решение задач по ООП следует технически рахности, если не по разным проектам, по по разным пакетам, так как разобраться в большом количестве разномастных файлов - это проблема
import java.util.Random;

public class Counter {
    public int min_value;// неправильное именование полей объекта, неправильно выбран атрибут доступа
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
        if (current_value < max_value)// отсутствие {}
            current_value++;// а каково будет поведения этого метода, когда current_value Ю= max_value, как пользователь кода должен понять, что счетчик уже достиг предела?
    }
    public void decreaseCounter() {
        if (current_value > min_value)
            current_value--;
    }
}
