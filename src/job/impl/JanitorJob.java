package job.impl;

import job.Job;

public class JanitorJob implements Job {
    private int salary;

    public JanitorJob(int salary) {
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
        return "janitor, earning €" + getSalary() + " per year";
    }
}
