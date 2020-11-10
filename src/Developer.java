public class Developer extends Employee {
    public Developer(String firstName, String lastName, Gender gender, int age) {
        super(firstName, lastName, gender, age);
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + " " + getLastName() + " (" +
                getGender() + ", " + getAge() + ") is working as a developer");
    }
}
