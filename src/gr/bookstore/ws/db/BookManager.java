package gr.bookstore.ws.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookManager {
	
	private Connection connection;
	
	
	public BookManager(){
		this.connection=Database.getConnection();
	}
	
	public int IsAvailable(String title)
	{
		String book;
		int result,quan;
	    book="";	
	    quan=999;
	    String sql="SELECT id FROM Book WHERE title LIKE ?";
	    String sql_2="SELECT quantity FROM Book WHERE title LIKE ?";
		try {			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			PreparedStatement preparedStatement2=connection.prepareStatement(sql_2);
			preparedStatement.setString(1, "%"+ title+"%");
			preparedStatement2.setString(1, "%"+ title+"%");
			ResultSet rs=preparedStatement.executeQuery();
			ResultSet rs2=preparedStatement2.executeQuery();
			while ( rs2.next() ) {					
				quan=rs2.getInt("quantity");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		if ( quan<=0){
			result=0;
			return result;			
		}
		else {
			result =1;
			return result;
		}		

	}
	
	public String  display_isbn(String title)
	{
		    String book;
		    book="";
		    System.out.println("hello world\n");
		    String sql="SELECT id FROM Book WHERE title LIKE ? AND quantity>0";
			try {
				/*SELECT * FROM `Book` WHERE title= :title and quantity>0*/
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, "%"+ title+"%");
				ResultSet rs=preparedStatement.executeQuery();
				
				while ( rs.next() ) {					
					book=rs.getString("id");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return book;
	}
	
	public void reduce(String title)
	{
		String sql="UPDATE Book SET quantity=(quantity-1)  WHERE title=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);			
			preparedStatement.setString(1, title);
			preparedStatement.executeUpdate();
		}catch ( SQLException e) {
			e.printStackTrace();
		}		
	}	
}
