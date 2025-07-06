public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor(1, "Dr. Mehta", "Cardiology");
        InPatient ip = new InPatient(101, "Amit Kumar", 45, "Hypertension", 12);
        OutPatient op = new OutPatient(102, "Sita Devi", 60, "Diabetes", "2025-07-05");

        doc.displayInfo();
        ip.displayInfo();
        op.displayInfo();

        Bill bill1 = new Bill(ip, doc, 10000, 10, 5); // 10% discount, 5% tax
        bill1.printBill();
    }
}
