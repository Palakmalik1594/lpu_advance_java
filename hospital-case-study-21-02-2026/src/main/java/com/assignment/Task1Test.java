package com.assignment;
import java.time.LocalDate;

public class Task1Test {

    public static void main(String[] args) {

        PatientService service = new PatientService();

        Patient p = new Patient("Ravi",
                LocalDate.now(),
                "B+",
                "99999");

        MedicalRecord r = new MedicalRecord(
                LocalDate.now(),
                "Fever",
                "Rest 3 days");

        p.setMedicalRecord(r);

        service.create(p);

        System.out.println("Task1 Done ");
    }
}