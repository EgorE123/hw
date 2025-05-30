import java.util.Arrays;
// TODO Реализуйте класс стека для работы с целыми значениями (стек целых).
//  Стек должен иметь фиксированный размер.
//  Реализуйте набор операций для работы со стеком:
//  ■ помещение целого значения в стек,
//  ■ выталкивание целого значения из стека,
//  ■ подсчет количества целых в стеке,
//  ■ проверку пустой ли стек,
//  ■ проверку полный ли стек,
//  ■ очистку стека

public class IntListOne {
    private int[] arrayList = new int[9];
    private int top = -1;

    // добавление элемента в стек
    public void addStack(int num) {
        if (isFull()) {
            System.out.println("Стек переполнен");
        } else {
            top++;
            arrayList[top] = num;
        }
    }

    // выталкивание вернего элемента
    public Integer pushStack() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return null;
        } else {
            int value = arrayList[top];
            arrayList[top] = 0;
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
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = 0;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }
}