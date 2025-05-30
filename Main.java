
public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact(" Egor ", " 12312 ", " po4ta@sfd.ru ");
        PersonalContact personalContact = new PersonalContact("Алеша", "873462", "alesha@ya.ru", "ул. Ленина 13-9");
        BusinessContact businessContact = new BusinessContact("Василий", "3242637", "sdyghf@er.com", "Top Academy");

        System.out.println(" Контакт:");
        contact.displayInfo();

        System.out.println("\n Личный контакт:");
        personalContact.displayInfo();

        System.out.println("\n Бизнес-контакт:");
        businessContact.displayInfo();

        System.out.println("---------");
        personalContact.displayInfo();
        businessContact.displayInfo();
        System.out.println("_________");

        double meters = 10;
        double foot = Converter.convertLength(meters, 1);
        System.out.println(meters + " метров = " + foot + " футов");

        double centimeters = 100;
        double foot1 = Converter.convertLengthCentimetre( 100, 1,1);
        System.out.println(centimeters + " сантиметров = " + foot1 + " футов");

        double kelvin = 20;
        double celsius = Converter.convertTemperature(20,9);
        System.out.println( kelvin + " Кельвинов = " +  celsius + " Цельсия" );

        double fahrenheit = 120;
        double celsius1 = Converter.convertTemperature(120);
        System.out.println( fahrenheit + " Фаренгейт = " +  celsius1 + " Цельсия" );

        double kilograms = 200;
        double pounds = Converter.convertWeight(200, 1);
        System.out.println( kilograms + " Килограмм = " +  pounds + " Фунта" );

        double grams = 20000;
        double pounds1 = Converter.convertWeight(20000, 1);
        System.out.println( grams + " грамм = " +  pounds1 + " Фунта" );



    }

}