import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UpdateUser {

	public void  Update() throws Exception {
		
		String url = "jdbc:mysql://127.0.0.1:3306/ecommerce";
		String username = "root";
		String password = "1234";
		String Query = "UPDATE new_table SET Name=?, Email=?, PhoneNumber=?, Address=?, UserType=?, Catagori=?, Product=?, Booking_ID=?, Booking_Quantity=? WHERE ID=?";
		try(
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		Scanner sc = new Scanner(System.in);
		){	
		
	    
	    
	    String Name = sc.next();
	    sc.nextLine();
	    
	    
	    String Email = sc.next();
	    sc.nextLine();
	    
	    
		int PhoneNumber = sc.nextInt();
	    sc.nextLine();
	    
	    
	    String Address = sc.next();
	    sc.nextLine();
	    
	    
	    String UserType = sc.next();
	    sc.nextLine();
	    
	    
	    String Catagori = sc.next();
	    sc.nextLine();
	    
	    
	    String Product = sc.next();
	    sc.nextLine();
	    
	    
	    int Booking_ID = sc.nextInt();
	    sc.nextLine();
	    
	    
	    int Booking_Quantity = sc.nextInt();
	    sc.nextLine();
	    
	    int ID = sc.nextInt();
	    sc.nextLine();

	    
	    pst.setString(1, Name);
	    pst.setString(2, Email);
	    pst.setInt(3, PhoneNumber);
	    pst.setString(4, Address);
	    pst.setString(5, UserType);
	    pst.setString(6, Catagori);
	    pst.setString(7, Product);
	    pst.setInt(8, Booking_ID);
	    pst.setInt(9, Booking_Quantity);
	    pst.setInt(10, ID); // ID used in WHERE clause
		
		int RowUpdated = pst.executeUpdate();
		System.out.println("User updated successfully. Rows affected: " + RowUpdated);
		con.close();
		}
		catch (SQLException e) {
	        System.err.println("SQL Error: " + e.getMessage());
	    } catch (InputMismatchException e) {
	        System.err.println("Invalid input. Please enter data in the correct format.");
	    } catch (Exception e) {
	        System.err.println("Unexpected error: " + e.getMessage());
	    }
		
		
		}

	
	
	public static void main(String[] args) throws Exception {

		UpdateUser obj = new UpdateUser();
		obj.Update();
		
	}

}
