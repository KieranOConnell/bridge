public abstract class Employee {
    //
    private String firstName, lastName;
    private Gender gender;
    private int age;

    // No argument constructor
    public Employee(){}

    // Constructor with all arguments
    public Employee(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    // Abstract method work() which will be implemented in subclasses
    public abstract void work();
}
