import java.util.LinkedList;
import java.util.Scanner;

public class LiveCircleGame {
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Заполнение списка участников
        System.out.println("Введите имена участников игры (для завершения введите \"конец\"):");
        String name;
        while (!(name = scanner.nextLine()).equalsIgnoreCase("конец")) {
            players.add(name.trim());
        }

        // Игровой процесс
        System.out.println("Игра начинается!");
        String lastWord = "";

        while (players.size() > 1) {
            for (int i = 0; i < players.size(); i++) {
                String currentPlayer = players.get(i); // Текущий игрок
                String inputWord;
                int count = 0;

                if (lastWord.isEmpty()) {
                    System.out.println(currentPlayer + ", назовите слово:");
                } else {
                    char lastChar = lastWord.charAt(lastWord.length() - 1);
                    if (lastChar == 'ь' && lastWord.length() > 1) {
                        lastChar = lastWord.charAt(lastWord.length() - 2);
                    } else if (lastChar == 'ы' && lastWord.length() > 1) {
                        lastChar = lastWord.charAt(lastWord.length() - 2);
                    }
                    System.out.println(currentPlayer + ", назовите слово, начинающееся с буквы \"" + lastChar + "\":");
                }

                // Проверяем правильность введенного слова
                while (true) {
                    inputWord = scanner.nextLine().toLowerCase().trim();

                    if (inputWord.isEmpty()) {
                        count++;
                        System.out.println("Неверное слово! Попробуйте еще раз:");
                        continue;
                    }
                    // Проверка начальной буквы введенного слова
                    char firstChar = inputWord.charAt(0);
                    char lastChar = lastWord.isEmpty() ? ' ' : lastWord.charAt(lastWord.length() - 1);
                    if (lastChar == 'ь' && lastWord.length() > 1) {
                        lastChar = lastWord.charAt(lastWord.length() - 2);
                    } else if (lastChar == 'ы' && lastWord.length() > 1) {
                        lastChar = lastWord.charAt(lastWord.length() - 2);
                    }

                    if (lastWord.isEmpty() || firstChar == lastChar) {
                        lastWord = inputWord;
                        break;
                    } else {
                        count++;
                        System.out.println("Неверное слово! Попробуйте еще раз:");
                        if (count >= 3) {
                            System.out.println("Игрок " + currentPlayer + " проиграл, так как ввел слово неправильно 3 раза!");
                            players.remove(i);
                            i--;
                            break;
                        }
                    }
                }
            }
        }

        // Победитель
        if (players.size() == 1) {
            System.out.println("Поздравляем, " + players.poll() + " - это победитель игры!");
        } else {
            System.out.println("Игра завершена, не осталось игроков!");
        }

        System.out.println("Последнее слово в игре: " + lastWord);
        scanner.close();
    }
}