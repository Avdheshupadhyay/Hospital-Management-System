public class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(int id, String name, int age, String medicalHistory, String appointmentDate) {
        super(id, name, age, medicalHistory);
        this.appointmentDate = appointmentDate;
    }

    public OutPatient(int id, String name, String appointmentDate) {
        super(id, name);
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() { return appointmentDate; }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + getName() + ", Appointment: " + appointmentDate);
    }
}
