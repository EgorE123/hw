// TODOЗадача 1: Сравнение массивов
//Напишите обобщенный метод, который сравнивает два массива одного типа и возвращает true,
// если они равны (имеют одинаковые значения в одном и том же порядке)
// и false в противном случае.
public class EqualArrays {
    public static <T> boolean ArraysEqual(T[] arrayOne, T[] arrayTwo) {

        if (arrayOne == null && arrayTwo == null) {
            return true;
        }
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }
}


