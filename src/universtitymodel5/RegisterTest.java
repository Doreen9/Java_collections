package universtitymodel5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegisterByLevel() {
        List<Double> studentGrades1 = Arrays.asList(22.50, 3.52);
        List<Double> studentGrades2 = Arrays.asList(12.50, 44.52);
        List<Double> studentGrades3 = Arrays.asList(10.50, 34.52);
        List<Double> studentGrades4 = Arrays.asList(20.50, 19.52);
        List<Student> students = Arrays.asList(new Student(studentGrades1, "Christiana Asare", Level.FIRST), new Student(studentGrades2, "Samuel Kwakye", Level.FOURTH), new Student(studentGrades3, "Yaa Nuamah", Level.FOURTH),
                new Student(studentGrades4, "Doreen Dodoo", Level.FIRST));

        Register register1 = new Register(students);
        Set<Map.Entry<Level, List<Student>>> studentsByLevel = register1.getRegisterByLevel(Level.FIRST);
        System.out.println(studentsByLevel);
    }
}