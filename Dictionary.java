import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("dog", List.of("sobaka"));
        dictionary.put("brother", List.of("brat"));
        dictionary.put("mother", List.of("mama", "mat"));
        dictionary.put("father", List.of("otec", "papa"));
        dictionary.put("home", List.of("dom"));

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Поиск слова");
            System.out.println("2 - Удаление по ключу");
            System.out.println("3 - Удаление по значению");
            System.out.println("4 - Редактирование значения");
            System.out.println("5 - Редактирование ключа");
            System.out.println("6 - Выйти");
            System.out.print("Введите номер действия: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    // Поиск слова
                    System.out.print("Vvedite slovo : ");
                    String word = scanner.nextLine();
                    word = word.toLowerCase();

                    if (dictionary.containsKey(word)) {
                        System.out.println(word + " (en) => " + dictionary.get(word) + " (ru)");
                    } else {
                        boolean foundInValues = false;
                        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                            if (entry.getValue().contains(word)) {
                                System.out.println(entry.getKey() + " (en) => " + entry.getValue() + " (ru)");
                                foundInValues = true;
                                break;
                            }
                        }
                        if (!foundInValues) {
                            System.out.print("Dannoe slovo otsutsvuet,Ne xotite li vi eqo dobavit\n1 - Da\n2 - Net\n");
                            int select = scanner.nextInt();
                            scanner.nextLine();
                            if (select == 1) {
                                System.out.print("Vvedite perevod dannoqo slova : ");
                                String newWord = scanner.nextLine().toLowerCase();
                                dictionary.put(newWord, List.of(word));
                            }
                        }
                    }
                    break;

                case 2:
                    // Удаление по ключу
                    System.out.print("Vvedite kluch dlya udaleniya: ");
                    String delKey = scanner.nextLine().toLowerCase();
                    if (dictionary.containsKey(delKey)) {
                        dictionary.remove(delKey);
                        System.out.println("Ключ '" + delKey + "' удален.");
                    } else {
                        System.out.println("Ключ не найден.");
                    }
                    break;

                case 3:
                    // Удаление по значению
                    System.out.print("Vvedite slovo dlya udaleniya iz vsekh slovarey: ");
                    String delValue = scanner.nextLine().toLowerCase();
                    boolean removed = false;
                    Iterator<Map.Entry<String, List<String>>> it = dictionary.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, List<String>> entry = it.next();
                        List<String> translations = new ArrayList<>(entry.getValue());
                        if (translations.contains(delValue)) {
                            translations.remove(delValue);
                            if (translations.isEmpty()) {
                                it.remove();
                                System.out.println("Удалено слово с ключом: " + entry.getKey());
                            } else {
                                dictionary.put(entry.getKey(), translations);
                                System.out.println("Удалено значение '" + delValue + "' из слова: " + entry.getKey());
                            }
                            removed = true;
                        }
                    }
                    if (!removed) {
                        System.out.println("Значение не найдено.");
                    }
                    break;

                case 4:
                    // Редактирование значения
                    System.out.print("Vvedite kluch slova dlya redaktirovaniya: ");
                    String editKey = scanner.nextLine().toLowerCase();
                    if (dictionary.containsKey(editKey)) {
                        System.out.println("Tekushie perevody: " + dictionary.get(editKey));
                        System.out.print("Vvedite novie perevody cherez zapyatu: ");
                        String input = scanner.nextLine();
                        String[] newTranslations = input.toLowerCase().split(",");
                        List<String> newList = new ArrayList<>();
                        for (String t : newTranslations) {
                            newList.add(t.trim());
                        }
                        dictionary.put(editKey, newList);
                        System.out.println("Znachenie obnovleno.");
                    } else {
                        System.out.println("Klyuch ne nayden.");
                    }
                    break;

                case 5:
                    // Редактирование ключа
                    System.out.print("Vvedite sushestvuyushchiy kluch: ");
                    String oldKey = scanner.nextLine().toLowerCase();
                    if (dictionary.containsKey(oldKey)) {
                        System.out.print("Vvedite noviy kluch: ");
                        String newKey = scanner.nextLine().toLowerCase();
                        List<String> value = dictionary.get(oldKey);
                        dictionary.remove(oldKey);
                        dictionary.put(newKey, value);
                        System.out.println("Klyuch izmenen s '" + oldKey + "' na '" + newKey + "'.");
                    } else {
                        System.out.println("Klyuch ne nayden.");
                    }
                    break;

                case 6:
                    System.out.println("Vykhody");
                    return;

                default:
                    System.out.println("Neverny vybor, popytka snova.");
            }

        } while (true);
    }
}