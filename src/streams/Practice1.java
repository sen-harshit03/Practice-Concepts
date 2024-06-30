package streams;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        // Student with maximum marks in Maths.
        List<Student> students = new ArrayList<>();
        // Students -> student -> subject == Maths -> updateMarks -> updateStudent
        for (Student student : students) {
            List<Subject> subjects = student.subjects;
            for (Subject subject : subjects) {
                if (subject.subjectName == "Maths") {
                    // update maxMarks and Student name
                }
            }
        }

        // stud -> List<sub>

    }
}

class Subject {
    String subjectName;
    Integer marks;
}

class Student {
    String name;
    List<Subject> subjects;
}
