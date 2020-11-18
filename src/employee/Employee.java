package employee;

import job.Job;

public abstract class Employee {
    // Variable instantiation
    protected Job job;
    private String firstName, lastName;
    private Gender gender;
    private int age;

    // No argument constructor
    public Employee(){}

    // Constructor with all arguments
    public Employee(Job job, String firstName, String lastName, Gender gender, int age) {
        this.job = job;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() method to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "job=" + job +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    // Abstract method work() which will be implemented in subclasses
    public abstract void work();
}
