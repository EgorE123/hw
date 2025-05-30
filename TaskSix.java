import java.util.Scanner;

// TODO Напишите программу,
//  которая определяет сезон года на основе месяца,
//  введенного пользователем.
public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month:");
        int month = 0;
        if (scanner.hasNextInt()) {
            month = scanner.nextInt();
        }
        switch (month) {
            case 1:
                System.out.println("January - Winter Season");
                break;
            case 2:
                System.out.println("February - Winter Season");
                break;
            case 3:
                System.out.println("March - Spring Season");
                break;
            case 4:
                System.out.println("April - Spring Season");
                break;
            case 5:
                System.out.println("May - Spring Season");
                break;
            case 6:
                System.out.println("June - Summer Season");
                break;
            case 7:
                System.out.println("July - Summer Season");
                break;
            case 8:
                System.out.println("August - Summer Season");
                break;
            case 9:
                System.out.println("September - Autumn Season");
                break;
            case 10:
                System.out.println("October - Autumn Season");
                break;
            case 11:
                System.out.println("November - Autumn Season");
                break;
            case 12:
                System.out.println("December - Winter Season");
                break;

            default:
                System.out.println("Incorrect month");
                break;

        }
    }
}
