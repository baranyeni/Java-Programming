import edu.tr.maltepe.oop.Person.Person;
import edu.tr.maltepe.oop.student.Student;
import edu.tr.maltepe.oop.professor.prof;

public class main {
    public static void main(String[] args) {
        Student StdBaran = create_student("Baran YENİ", "Computer Engineering Department", 2.95);

        // Print and display student information
        System.out.println(
                StdBaran.getName() + " is a student at the department of " + StdBaran.getDept()
                        + " GPA of this student is " + StdBaran.getGPA()
        );


        prof profEnsar = create_professor("Ensar Gül", "Computer Engineering Department");


        // Print and display professor information
        System.out.println(
                profEnsar.getName() + " is a lecturer at " + profEnsar.getLecture_name()
        );
    }

    private static Student create_student(String name, String dept, double GPA ) {
        Student student = new Student();
        student.setName(name);
        student.setGPA(GPA);
        student.setDept(dept);
        student.setType(Person.person_type.STUDENT);

        return student;
    }

    private static prof create_professor(String name, String dept) {
        prof professor = new prof();
        professor.setName(name);
        professor.setLecture_name(dept);
        professor.setType(Person.person_type.PROFESSOR);

        return professor;
    }
}
