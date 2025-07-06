# 🏥 Hospital Patient Management System

A Java-based Object-Oriented Project to manage hospital operations like patient registration, doctor assignment, and billing.

---

## 📘 Overview

This project simulates a **Hospital Patient Management System** for registering patients, assigning doctors, and generating bills. It uses core Java OOP concepts like classes, inheritance, polymorphism, encapsulation, interfaces, and constructors.

---

## 🧠 Concepts Used

### 🔹 OOP Principles
- **Encapsulation**: Private fields with public getters/setters (e.g., `medicalHistory`).
- **Abstraction**: Billing logic abstracted via `Payable` interface.
- **Inheritance**: `InPatient` and `OutPatient` inherit from `Patient`.
- **Polymorphism**: Method `displayInfo()` is overridden in `Doctor`, `Patient`, etc.

### 🔹 Classes Implemented
- `Patient`: Base class for all patients.
- `Doctor`: Holds doctor details and specialty.
- `Bill`: Implements billing logic.
- `InPatient` / `OutPatient`: Subclasses of `Patient`.

### 🔹 Interface
- `Payable`: Interface with method `calculatePayment()` used by `Bill`.

### 🔹 Constructor Overloading
- Separate constructors for emergency and normal admissions.

### 🔹 Access Modifiers
- Sensitive fields like `medicalHistory` are marked `private`.
- Exposed methods like `getSummary()` are `public`.

### 🔹 Operators
- Arithmetic and logical operators used to compute:
  - Discounts
  - Taxes
  - Final payment

---

## 📂 Project Structure

Hospital-Management-System/
│
├── Patient.java
├── InPatient.java
├── OutPatient.java
├── Doctor.java
├── Bill.java
├── Payable.java
└── Main.java



---

## ▶️ How to Run

1. Clone the repo or download the `.java` files.
2. Compile all classes:
   ```bash
   javac *.java
Run the main program:

bash
Copy code
java Main
🔍 Sample Features
Register new patients (normal/emergency)

Assign doctor based on department/specialty

Generate bill based on:

Number of days admitted

Consultation fee

Emergency surcharge

Discounts and tax

💡 Future Improvements
GUI integration using JavaFX or Swing

Database connectivity (MySQL)

Authentication system for staff

PDF billing export

👨‍💻 Author
Developed by Avdhesh Upadhyay

Java OOP Practice Project

📜 License
This project is for educational purposes only. Feel free to modify and use it.
