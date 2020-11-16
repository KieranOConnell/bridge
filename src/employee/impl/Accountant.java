package employee.impl;

import employee.Employee;
import employee.Gender;
import job.Job;

public class Accountant extends Employee {
    public Accountant(Job job, String firstName, String lastName, Gender gender, int age) {
        super(job, firstName, lastName, gender, age);
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + " " + getLastName() + " (" +
                getGender() + ", " + getAge() + ") is working as an " + getJob().work());
    }
}
