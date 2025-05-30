public class Main1 {
    public static void main(String[] args) {

        Math mathClass = new Math("Кукуев Ф.Ф,");
        History historyClass = new History("Иванов И.И.");
        Science scienceClass = new Science("Якупов Я.Я.");

        mathClass.study();
        historyClass.study();
        scienceClass.study();

        System.out.println("\nПредмет: " + mathClass.getSubjectName() + ", Учитель: " + mathClass.getTeacherName());
        System.out.println("Предмет: " + historyClass.getSubjectName() + ", Учитель: " + historyClass.getTeacherName());
        System.out.println("Предмет: " + scienceClass.getSubjectName() + ", Учитель: " + scienceClass.getTeacherName());

        System.out.println("----------------------------------------------------------------------");

        AudioPlayer audioPlayer = new AudioPlayer("Музыка");
        VideoPlayer videoPlayer = new VideoPlayer("Видео");
        System.out.println("AudioPlayer:");
        audioPlayer.play();
        audioPlayer.stop();
        System.out.println("VideoPlayer:");
        videoPlayer.play();
        videoPlayer.stop();

        Integer[] arrayOne = {1, 2, 3, 5};
        Integer[] arrayTwo = {1, 2, 3, 4};
        System.out.println(EqualArrays.ArraysEqual(arrayOne, arrayTwo));





        Violin violin = new Violin("Скрипка", "Скрипка раритет 1800г");
        violin.sound();
        violin.desc();
        violin.show();


    }

}

