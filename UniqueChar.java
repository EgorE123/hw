import java.util.HashSet;

// TODO Задача 1: Проверка на уникальность
//Напишите метод, который принимает на вход строку и проверяет,
// содержит ли она все уникальные символы.
// Метод должен вернуть true, если все символы в строке уникальны, и false в противном случае
public class UniqueChar {
    public boolean hasUnique(String string){
        HashSet<Character> charSet = new HashSet<>();
        for (char c: string.toCharArray()){
            if (charSet.contains(c)){
                return false;
            }
            charSet.add(c);
        }
        return true;
    }
}
