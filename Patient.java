public abstract class Patient {
    private int id;
    private String name;
    private int age;
    private String medicalHistory;

    // Normal admission constructor
    public Patient(int id, String name, int age, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Emergency admission constructor
    public Patient(int id, String name) {
        this(id, name, 0, "Emergency admission: Details pending");
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Encapsulated medical history
    private String getMedicalHistory() { return medicalHistory; }
    public String getSummary() {
        return "Patient: " + name + ", Age: " + age + ", History: " + medicalHistory;
    }

    public abstract void displayInfo();
}
