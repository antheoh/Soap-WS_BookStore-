package gr.bookstore.ws;

import gr.bookstore.ws.db.BookManager;

public class RetrieveBook implements Books_IF {
	BookManager bm=new BookManager();
	@Override
	public int getQuantiy(String title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int check_availability(String title) {
		// TODO Auto-generated method stub
		return 2;
	}
	
	@Override
	public String show_book(String title) {
		// TODO Auto-generated method stub
		return bm.display_isbn(title);
	}

}
