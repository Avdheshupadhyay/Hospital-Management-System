public class Bill implements Payable {
    private Patient patient;
    private Doctor doctor;
    private double baseAmount;
    private double discount; // as percentage, e.g. 10 for 10%
    private double tax; // as percentage, e.g. 5 for 5%
    private double total;

    public Bill(Patient patient, Doctor doctor, double baseAmount, double discount, double tax) {
        this.patient = patient;
        this.doctor = doctor;
        this.baseAmount = baseAmount;
        this.discount = discount;
        this.tax = tax;
        this.total = calculatePayment();
    }

    @Override
    public double calculatePayment() {
        double discounted = baseAmount - (baseAmount * (discount / 100)); // discount
        double taxed = discounted + (discounted * (tax / 100)); // tax
        return taxed;
    }

    public double getTotal() { return total; }
    public void printBill() {
        System.out.println("--- Bill ---");
        System.out.println(patient.getSummary());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Base: Rs." + baseAmount);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Tax: " + tax + "%");
        System.out.println("Total: Rs." + total);
    }
}
