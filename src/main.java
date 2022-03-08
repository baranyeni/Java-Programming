import com.example.student.Student;
import com.example.professor.prof;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.get_name();
        student.get_id();

        prof profEnsar = create_professor("Ensar Gül", "Computer Engineering Department");

        profEnsar.get_name();
        profEnsar.get_dept();
    }

    private static prof create_professor(String name, String dept) {
        prof professor = new prof();
        professor.name = name;
        professor.dept = dept;

        return professor;
    }
}
