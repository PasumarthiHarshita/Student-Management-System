import java.sql.*;

public class StudentDAO {
    public void addStudent(Student s){
        String sql="INSERT INTO students(name,department,marks) VALUES(?,?,?)";
        try(Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql)){
            ps.setString(1,s.getName());
            ps.setString(2,s.getDepartment());
            ps.setInt(3,s.getMarks());
            ps.executeUpdate();
            System.out.println("Student Added");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
