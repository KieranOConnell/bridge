package job.impl;

import employee.Gender;
import employee.impl.Janitor;

public class JanitorJob extends Janitor {
    private int salary;

    public JanitorJob(String firstName, String lastName, Gender gender, int age, int salary) {
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
