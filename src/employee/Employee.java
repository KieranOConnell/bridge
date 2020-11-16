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

    // Getter for job
    public Job getJob() {
        return job;
    }

    // Setter for job
    public void setJob(Job job) {
        this.job = job;
    }

    // Getter for first name (forename)
    public String getFirstName() {
        return firstName;
    }

    // Setter for first name (forename)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for last name (surname)
    public String getLastName() {
        return lastName;
    }

    // Setter for last name (surname)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for gender
    public Gender getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
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
