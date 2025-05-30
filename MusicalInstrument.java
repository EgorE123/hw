public class MusicalInstrument {

    private String instrumentName;
    private String instrumentInfo;

    public MusicalInstrument(String instrumentName, String instrumentInfo) {
        this.instrumentName = instrumentName;
        this.instrumentInfo = instrumentInfo;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getInstrumentInfo() {
        return instrumentInfo;
    }
    public void sound() {
        System.out.print("Играет звук: ");
    }
    public void show() {
        System.out.println("Инструмент: " + instrumentName);
    }
    public void desc() {
        System.out.println("Информация об инструменте: " + instrumentInfo);
    }

}
