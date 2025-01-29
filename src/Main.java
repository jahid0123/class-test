import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Meme", "IsDB",
                29, "Pervej", 50.0 ));
        students.add(new Student(2, "Bithy", "IsDB",
                28, "Pervej", 60.0 ));
        students.add(new Student(3, "Saima", "IsDB",
                27, "Pervej", 70.0 ));
        students.add(new Student(4, "Farzana", "IsDB",
                26, "Pervej", 65.0 ));
        students.add(new Student(5, "Hemel", "IsDB",
                24, "Pervej", null ));

        String insert = "insert into students(id, name, class, age, classteacher, mark) values(?, ?, ?, ?, ?, ?)";
        InsertStudent insertStudent = new InsertStudent();
       // insertStudent.insertStudents(students, insert);

        String fetchStudents1 = "select * from students";
        FetchStudent fetchStudent0 = new FetchStudent();
       fetchStudent0.fetchStudent(fetchStudents1);

        String update = "update students set classteacher = 'Mizanur Rahman' where id = 5";
        UpdateStudent updateStudent = new UpdateStudent();
       // updateStudent.updateStudent(update);

        String delete = "delete from students where id = 5";
        DeleteStudent deleteStudent = new DeleteStudent();
        //deleteStudent.deleteStudent(delete);





    }
}