package job.impl;

import job.Job;

public class TeacherJob implements Job {
    private int salary;

    public TeacherJob(int salary) {
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
        return "teacher, earning €" + getSalary() + " per year";
    }
}
