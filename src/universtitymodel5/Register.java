package universtitymodel5;

import java.util.*;

public class Register{
    private List<Student> students;

    public Register(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegister() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }

        return studentNames;
    }

    public List<Student> getRegisterByLevel(Level level) {
        Map<Level, List<Student>> studentsMap = new HashMap<>();
        for(Student student: students ){
            studentsMap.put(level, students);
        }
        return (List<Student>) studentsMap;
    }

}
