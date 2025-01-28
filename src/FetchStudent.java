import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FetchStudent {

    public void fetchStudent(String s){

        try (Connection connection = DatabaseConnection.orclConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(s)){

            System.out.println("=========Student Information=============");
            while (resultSet.next()){
                resultSet.toString();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void fetchStudents(String s){
        ArrayList<Student> students = new ArrayList<>();

        try(Connection connection = DatabaseConnection.orclConnection();
          Statement statement = connection.createStatement();
          ResultSet resultSet=statement.executeQuery(s)){

            System.out.println("=========Student Information=============");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String stdName = resultSet.getString("name");
                String stdClass = resultSet.getString("class");
                int stdAge = resultSet.getInt("age");
                String classTeacher = resultSet.getString("classTeacher");
                Double mark = resultSet.getDouble("mark");



                System.out.println("ID: "+id+"\nName: "+stdName+"\nClass: "+stdClass+"\nAge: "
                                    +stdAge+"\nClass Teacher: "+classTeacher+"\nMark: "+ mark);

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
