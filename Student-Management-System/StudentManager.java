import java.util.ArrayList;

class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        for(Student s : students) {
            s.displayInfo();
        }
    }

    public Student searchStudent(int id) {
        for(Student s : students) {
            if(s.getId() == id)
                return s;
        }
        return null;
    }
}
