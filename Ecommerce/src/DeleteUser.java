import java.sql.*;
import java.util.*;

public class DeleteUser {

	public void Delete() throws Exception {
	    String url = "jdbc:mysql://127.0.0.1:3306/ecommerce";
	    String username = "root";
	    String password = "1234";
	    String query = "DELETE FROM new_table WHERE ID=?";

	    try (
	        Connection con = DriverManager.getConnection(url, username, password);
	        PreparedStatement pst = con.prepareStatement(query);
	        Scanner sc = new Scanner(System.in);
	    ) {
	        System.out.print("Enter ID to delete: ");
	        int ID = sc.nextInt();

	        pst.setInt(1, ID);
	        int rows = pst.executeUpdate();

	        if (rows > 0) {
	            System.out.println("User deleted successfully. Rows affected: " + rows);
	        } else {
	            System.out.println("No user found with the given ID.");
	        }

	    } catch (SQLException e) {
	        System.err.println("SQL Error: " + e.getMessage());
	    } catch (InputMismatchException e) {	
	        System.err.println("Invalid input. Please enter a valid ID.");
	    } catch (Exception e) {
	        System.err.println("Unexpected error: " + e.getMessage());
	    }
	}
	
	
	public static void main(String[] args) throws Exception {
		
		DeleteUser obj = new DeleteUser();
		obj.Delete();

	}

}
