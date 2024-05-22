package quanLiStudent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

    public void updatePoint(String id, double newPoint) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setPoint(newPoint);
                break;
            }
        }
    }

    public void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                break;
            }
        }
    }

    public void displayStudentsByClassroom(String classroom) {
        for (Student student : students) {
            if (student.getClassroom().equals(classroom)) {
                student.display();
            }
        }
    }

    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
    }

    public void sortByPoint() {
        Collections.sort(students, Comparator.comparingDouble(Student::getPoint));
    }
}
