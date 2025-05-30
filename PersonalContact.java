public class PersonalContact extends Contact{
    private String address;
    public PersonalContact(String name, String number, String email, String address) {
        super(name, number, email);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" адрес: " + address);
    }
}
