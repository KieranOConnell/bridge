package job.impl;

import job.Job;

public class DeveloperJob implements Job {
    private int salary;

    public DeveloperJob(int salary) {
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
        return "developer, earning €" + getSalary() + " per year";
    }
}
