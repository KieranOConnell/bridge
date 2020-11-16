package main;

import employee.Employee;
import employee.Gender;
import employee.impl.*;
import job.impl.*;

public class Driver {
    public static void main(String[] args) {
        Employee teacher = new Teacher(new TeacherJob(120000), "John", "Terry", Gender.MALE, 35);
        teacher.work();

        Employee developer = new Developer(new DeveloperJob(87500), "Sarah", "Moriarty", Gender.FEMALE, 21);
        developer.work();

        Employee janitor = new Janitor(new JanitorJob(40000), "Harry", "Morgan", Gender.MALE, 52);
        janitor.work();

        Employee doctor = new Doctor(new DoctorJob(350000), "Chris", "Collins", Gender.MALE, 47);
        doctor.work();

        Employee accountant = new Accountant(new AccountantJob(200000), "Beatrice", "Beetroot", Gender.FEMALE, 68);
        accountant.work();
    }
}
