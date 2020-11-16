package job.impl;

import job.Job;

public class AccountantJob implements Job {
    private int salary;

    public AccountantJob(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String work() {
        return "accountant, earning €" + getSalary() + " per year";
    }
}
