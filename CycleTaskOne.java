import java.util.Scanner;

// TODO
// Определение года на високосность
//Напишите программу, которая запрашивает год и определяет,
// является ли он високосным, используя boolean для условия.
// Погуглите условие, когда год високосный, там не так все просто,
// как выглядит на первый взгляд.
public class CycleTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0 ) {
                if ( year % 400 == 0)
                    leapYear = true;
                    else
                        leapYear = false;
                }
            }
            else
                leapYear = false;
            if (!leapYear)
                System.out.println("Не високосный год");
            else
                System.out.println("Високосный");
        }
    }

