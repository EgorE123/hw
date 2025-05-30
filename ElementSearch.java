//TODO Задача 3: Поиск элемента
//Напишите обобщенный метод для поиска элемента в массиве.
// Метод должен принимать массив и элемент для поиска,
// а затем возвращать индекс этого элемента в массиве. Если элемент не найден, вернуть -1.

public class ElementSearch {
    public static <T> int findIndex(T[] array, T element) {
       if (array == null ) {
           return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }

        return -1;
    }
}
