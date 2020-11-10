public class AccountantJob extends Accountant {
    private int salary;

    public AccountantJob(String firstName, String lastName, Gender gender, int age, int salary) {
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
