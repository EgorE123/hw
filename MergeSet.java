import java.util.HashSet;
import java.util.Set;

//TODO Задача 2: Объединение множеств
//Напишите метод, который принимает на вход два множества Set
// и возвращает новое множество, содержащее все элементы
// из обоих исходных множеств.
public class MergeSet {
    public static<T> Set<T> mergeSets(Set<T> a, Set<T> b)
    {
        Set<T> set = new HashSet<>();

        set.addAll(a);
        set.addAll(b);

        return set;
    }
}
