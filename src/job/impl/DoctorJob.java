package job.impl;

import job.Job;

public class DoctorJob implements Job {
    private int salary;

    public DoctorJob(int salary) {
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
        return "doctor, earning €" + getSalary() + " per year";
    }
}
