public class Janitor extends Employee {
    public Janitor(String firstName, String lastName, Gender gender, int age) {
        super(firstName, lastName, gender, age);
    }

    @Override
    public void work() {
        System.out.println("I am working as a janitor");
    }
}
