public class BusinessContact extends Contact{
    private String companyName;
    public BusinessContact(String name, String number, String email, String companyName) {
        super(name, number, email);
        this.companyName = companyName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" компания: " + companyName);
    }
}
