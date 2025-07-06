public class InPatient extends Patient {
    private int wardNumber;

    public InPatient(int id, String name, int age, String medicalHistory, int wardNumber) {
        super(id, name, age, medicalHistory);
        this.wardNumber = wardNumber;
    }

    public InPatient(int id, String name, int wardNumber) {
        super(id, name);
        this.wardNumber = wardNumber;
    }

    public int getWardNumber() { return wardNumber; }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + getName() + ", Ward: " + wardNumber);
    }
}
