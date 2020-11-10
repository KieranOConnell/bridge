public class Accountant extends Employee {
    public Accountant(String firstName, String lastName, Gender gender, int age) {
        super(firstName, lastName, gender, age);
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + " " + getLastName() + " (" +
                getGender() + ", " + getAge() + ") is working as an accountant");
    }
}
