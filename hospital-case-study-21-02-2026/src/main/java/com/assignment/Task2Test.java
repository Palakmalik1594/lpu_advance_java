package com.assignment;

public class Task2Test {

    public static void main(String[] args) {

        DepartmentService deptService = new DepartmentService();

        Department d = new Department("Cardiology");

        Doctor doc1 = new Doctor("Dr. Mehwish");
        Doctor doc2 = new Doctor("Dr. Singhania");

        d.addDoctor(doc1);
        d.addDoctor(doc2);

        deptService.create(d);

        System.out.println("Task2 Done ");
    }
}