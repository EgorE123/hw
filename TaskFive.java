// TODO Задача 5: Замена всех чисел в строке на символ "X" (String)
//Условие: Напишите метод для замены всех чисел в строке на символ "X".
//Было: "There are 3 cats and 2 dogs in the yard."
//Стало: There are X cats and X dogs in the yard.
public class TaskFive {
    public static void main(String[] args) {
        String replaced = "There are 3 cats and 2 dogs in the yard.".replace("3", "X");
        String replacedTwo = replaced.replace("2", "X");
        System.out.println(replacedTwo);
    }
}
