import java.util.Scanner;
public class SwitchTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1-4:"); // ввести число от 1 до 4
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("Create new file"); // создать новый файл
                break;
            case 2:
                System.out.println("Save file"); // сохранить файл
                break;
            case 3:
                System.out.println("Delete file"); // удалить файл
                break;
            case 4:
                System.out.println("Change file"); // изменить файл
                break;
            default:
                System.out.println("Error"); // ошибка
                break;
        }

    }
}
