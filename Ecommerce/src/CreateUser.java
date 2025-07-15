import java.sql.*;
import java.util.*;

public class CreateUser {

	
	public void  create() throws Exception {
		
	String url = "jdbc:mysql://127.0.0.1:3306/ecommerce";
	String username = "root";
	String password = "1234";
	String Query ="insert into new_table values(?,?,?,?,?,?,?,?,?,?)";
	try(
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(Query);
	Scanner sc = new Scanner(System.in);
	){	
	
	int ID = sc.nextInt();
    sc.nextLine();
    
    
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
    
	pst.setInt(1,ID);
	pst.setString(2, Name);
	pst.setString(3, Email);
	pst.setInt(4, PhoneNumber);
	pst.setString(5, Address);
	pst.setString(6, UserType);
	pst.setString(7, Catagori);
	pst.setString(8, Product);
	pst.setInt(9, Booking_ID);
	pst.setInt(10, Booking_Quantity);
	
	int rowsAffected = pst.executeUpdate();
	System.out.println("User inserted successfully. Rows affected: " + rowsAffected);
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
		
		CreateUser obj = new CreateUser();
		obj.create();
		

	}

}
