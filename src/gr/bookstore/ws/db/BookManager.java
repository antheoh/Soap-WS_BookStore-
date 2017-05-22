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
	
	
	public int  display_isbn(String title)
	{
		    int book;
		    book=0;
		    System.out.println("hello world\n");
		    String sql="SELECT isbn FROM Book WHERE title LIKE ? AND quantity>0";
			try {
				/*SELECT * FROM `Book` WHERE title= :title and quantity>0*/
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, "%"+ title+"%");
				ResultSet rs=preparedStatement.executeQuery();
				
				while ( rs.next() ) {					
					book=rs.getInt("isbn");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return book;
	}
	
	
	
	
	
	
}
