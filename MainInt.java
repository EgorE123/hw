public class MainInt {
    public static void main(String[] args) {

        //первое задание
        IntListOne intListOne = new IntListOne();

        intListOne.addStack(1);
        intListOne.addStack(2);
        intListOne.addStack(3);
        intListOne.addStack(4);
        intListOne.addStack(5);
        intListOne.addStack(6);
        intListOne.addStack(7);
        intListOne.addStack(8);
        intListOne.addStack(9);

        // полный ли стек (до выталкивания)
        System.out.println(intListOne.isFull());

        System.out.println(intListOne.toString());
        //выталкивание
        System.out.println("выталкивание: " + intListOne.pushStack());
       // intListOne.pushStack();
        System.out.println(intListOne.toString());

        // подсчет целых
        System.out.println("Количество целых: " + intListOne.countStack());
        // пустой ли стек
        System.out.println(intListOne.isEmpty());
        // полный ли стек (после выталкивания)
        System.out.println(intListOne.isFull());
        // очистка
        intListOne.clearStack();
        System.out.println(intListOne.toString());

        // c параметром
        System.out.println("----------------------------------------------------------------");


        IntListTwo<Integer> intListTwo = new IntListTwo<>();
        intListTwo.addStack(1);
        intListTwo.addStack(2);
        intListTwo.addStack(3);
        intListTwo.addStack(4);
        intListTwo.addStack(5);
        intListTwo.addStack(6);
        intListTwo.addStack(7);
        intListTwo.addStack(8);
        intListTwo.addStack(9);
        System.out.println(intListTwo);

        // полный ли стек(до выталкивания)
        System.out.println(intListTwo.isFull());

        System.out.println("выталкивание: " + intListTwo.pushStack());
        System.out.println("После выталкивания: " + intListTwo);


        // подсчет целых
        System.out.println("Количество целых: " + intListTwo.countStack());
        // пустой ли стек
        System.out.println(intListTwo.isEmpty());
        // полный ли стек(после выталкивания)
        System.out.println(intListTwo.isFull());
        // очистка
        intListTwo.clearStack();
        System.out.println(intListTwo.toString());
    }
}



