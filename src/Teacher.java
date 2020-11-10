public class Teacher extends Employee {
    public Teacher(String firstName, String lastName, Gender gender, int age) {
        super(firstName, lastName, gender, age);
    }

    @Override
    public void work() {
        System.out.println("I am working as a teacher");
    }
}
