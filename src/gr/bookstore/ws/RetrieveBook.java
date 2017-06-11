package gr.bookstore.ws;

import gr.bookstore.ws.db.BookManager;

public class RetrieveBook implements Books_IF {
	BookManager bm=new BookManager();
	@Override
	public int getQuantiy(String title) {
		// TODO Auto-generated method stubb
		return 0;
	}

	@Override
	public int check_availability(String title) {
		if (bm.IsAvailable(title)==1) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	@Override
	public String show_book(String title) {
		// TODO Auto-generated method stub
		return bm.display_isbn(title);
	}
	
	
	public void recude_quantity(String title) {
		bm.reduce(title);		
	}
	
}
