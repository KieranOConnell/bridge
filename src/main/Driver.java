package main;

import employee.Employee;
import employee.Gender;
import employee.impl.*;

public class Driver {
    public static void main(String[] args) {
        Employee teacher = new Teacher("John", "Terry", Gender.MALE, 35);
        teacher.work();

        Employee developer = new Developer("Sarah", "Moriarty", Gender.FEMALE, 21);
        developer.work();

        Employee janitor = new Janitor("Harry", "Morgan", Gender.MALE, 52);
        janitor.work();

        Employee doctor = new Doctor("Chris", "Collins", Gender.MALE, 47);
        doctor.work();

        Employee accountant = new Accountant("Beatrice", "Beetroot", Gender.FEMALE, 68);
        accountant.work();
    }
}
