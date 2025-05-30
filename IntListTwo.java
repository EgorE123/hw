// TODO тоже что и в первом задании только с параметром
import java.util.Arrays;

public class IntListTwo<T> {
    Object[] arrayList = new Object[9];
    private int top = -1;

    // добавление элемента
    public void addStack(T num) {
        if (isFull()) {
            System.out.println("Стек переполнен");
        } else {
            top++;
            arrayList[top] = num;
        }
    }

    // выталкивание элемента
    public T pushStack() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return null;
        } else {
            T value = (T) arrayList[top];
            arrayList[top] = null;
            top--;
            return value;
        }
    }

    // подсчет элементов
    public int countStack() {
        return top + 1;
    }

    // пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    // полный ли стек
    public boolean isFull() {
        return top == arrayList.length - 1;
    }

    // очистка стека
    public void clearStack() {
        Arrays.fill(arrayList, null);
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }
}