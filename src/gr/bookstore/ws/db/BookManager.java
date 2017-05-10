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
	
	
	public String  display_info_books(String title)
	{
		    String book;
		    book="eurotrip";
		    System.out.println("hello world\n");
		    String sql="SELECT id FROM Book WHERE title LIKE ?";
			try {
				/*SELECT * FROM `Book` WHERE title= :title and quantity>0*/
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, "%"+ title+"%");
				ResultSet rs=preparedStatement.executeQuery();
				
				while ( rs.next() ) {
					System.out.println("hello world2\n");
					book=rs.getString("id");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return book;
	}
	
	
	
	
	
	
}
