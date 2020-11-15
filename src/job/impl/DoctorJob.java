package job.impl;

import employee.Gender;
import employee.impl.Doctor;

public class DoctorJob extends Doctor {
    private int salary;

    public DoctorJob(String firstName, String lastName, Gender gender, int age, int salary) {
        super(firstName, lastName, gender, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
