public class Violin extends MusicalInstrument{
    public Violin(String instrumentName, String instrumentInfo) {
        super(instrumentName, instrumentInfo);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Скрип скрипки))");
    }
}
