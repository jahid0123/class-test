import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

    public void updateStudent(String s){

        try(Connection connection = DatabaseConnection.orclConnection();
            Statement statement = connection.createStatement()){

            int rowAffected = statement.executeUpdate(s);
            if (rowAffected>0){
                System.out.println("Update successfully");
            }else {
                System.out.println("failed update!");
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

    }
}
