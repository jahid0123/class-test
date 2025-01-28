import java.sql.*;
import java.util.ArrayList;

public class InsertStudent {

    public void insertStudent(String s){

        try (Connection connection = DatabaseConnection.orclConnection();
             Statement statement = connection.createStatement()){

            int rowAffected = statement.executeUpdate(s);
            if (rowAffected>0){
                System.out.println("Insert student successfully");
            }else {
                System.out.println("Insert student failed!");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void insertStudents(ArrayList<Student> students, String s){

        try (Connection connection=DatabaseConnection.orclConnection();
             PreparedStatement statement = connection.prepareStatement(s)){

            for (Student student: students){
                statement.setInt(1, student.getStdID());
                statement.setString(2, student.getStdName());
                statement.setString(3, student.getStdClass());
                statement.setInt(4, student.getStdAge());
                statement.setString(5, student.getClassTeacher());


                if (student.getMark() != null) {
                    statement.setDouble(6, student.getMark());
                } else {
                    statement.setNull(6, Types.DOUBLE);
                }

                statement.addBatch();
            }
            int[] rowAffected = statement.executeBatch();
            System.out.println("Rows inserted: "+ rowAffected.length);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
