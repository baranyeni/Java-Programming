import edu.tr.maltepe.oop.Person.Person;
import edu.tr.maltepe.oop.student.Student;
import edu.tr.maltepe.oop.professor.prof;

public class main {
    public static void main(String[] args) {
        Student StdBaran = create_student("Baran YENİ", "Computer Engineering Department");

        StdBaran.get_name();
        StdBaran.get_id();


        prof profEnsar = create_professor("Ensar Gül", "Computer Engineering Department");

        profEnsar.get_name();
        profEnsar.get_dept();
    }

    private static Student create_student(String name, String dept) {
        Student student = new Student();
        student.name = name;
        student.type = Person.person_type.STUDENT;

        return student;
    }

    private static prof create_professor(String name, String dept) {
        prof professor = new prof();
        professor.name = name;
        professor.type = Person.person_type.PROFESSOR;

        return professor;
    }
}
