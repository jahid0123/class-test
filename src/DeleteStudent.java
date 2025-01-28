import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {


    public void deleteStudent(String s){

        try(Connection connection= DatabaseConnection.orclConnection();
            Statement statement = connection.createStatement()){

            int rowAffected =statement.executeUpdate(s);
            if (rowAffected>0){
                System.out.println("Student delete successfully");
            }else{
                System.out.println("Student deletion failed!");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
