package gr.bookstore.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface Books_IF {
	
	@WebMethod
	/*this method returns the quantity of a book*/
	int getQuantiy (String title);
	
	@WebMethod
	/*this method return 1 if the book exists and 0 if not*/
	int check_availability(String title);
	
	@WebMethod
	public String show_book(String title);

}
