public class Contact {
    private String name;
    private String number;
    private String email;

    public Contact (String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }


    public void displayInfo() {
        System.out.println(" Имя: " + name +"\n "+ "номер: " + number+ " " + "\n почта: " + email + " ");
    }

}
