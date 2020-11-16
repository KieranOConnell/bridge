import employee.Employee;
import employee.Gender;
import employee.impl.*;
import job.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class EmployeeTest {
    @Test
    public void accountantTest() {
        String accountantExpected = "Beatrice Beetroot (Female, 68) is working as an accountant, earning €200000 per year\r\n";

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Employee accountant = new Accountant(new AccountantJob(200000), "Beatrice", "Beetroot", Gender.FEMALE, 68);
        accountant.work();

        Assertions.assertEquals(accountantExpected, output.toString());
    }

    @Test
    public void developerTest() {
        String developerExpected = "Sarah Moriarty (Female, 21) is working as a developer, earning €87500 per year\r\n";

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Employee developer = new Developer(new DeveloperJob(87500), "Sarah", "Moriarty", Gender.FEMALE, 21);
        developer.work();

        Assertions.assertEquals(developerExpected, output.toString());
    }

    @Test
    public void doctorTest() {
        String doctorExpected = "Chris Collins (Male, 47) is working as a doctor, earning €350000 per year\r\n";

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Employee doctor = new Doctor(new DoctorJob(350000), "Chris", "Collins", Gender.MALE, 47);
        doctor.work();

        Assertions.assertEquals(doctorExpected, output.toString());
    }

    @Test
    public void janitorTest() {
        String janitorExpected = "Harry Morgan (Male, 52) is working as a janitor, earning €40000 per year\r\n";

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Employee janitor = new Janitor(new JanitorJob(40000), "Harry", "Morgan", Gender.MALE, 52);
        janitor.work();

        Assertions.assertEquals(janitorExpected, output.toString());
    }

    @Test
    public void teacherTest() {
        String teacherExpected = "John Terry (Male, 35) is working as a teacher, earning €120000 per year\r\n";

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Employee teacher = new Teacher(new TeacherJob(120000), "John", "Terry", Gender.MALE, 35);
        teacher.work();

        Assertions.assertEquals(teacherExpected, output.toString());
    }
}
