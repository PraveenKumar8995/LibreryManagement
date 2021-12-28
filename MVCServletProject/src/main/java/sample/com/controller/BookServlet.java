package sample.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sample.com.Model.Books;
import sample.com.service.BookService;


@WebServlet("/books")
public class BookServlet<HttpsSession> extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	//private static final HttpServletRequest request=null;
	BookService bookService=new BookService();
	
    public BookServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		List<Books> myList=bookService.getBookList();
		
		HttpSession session=request.getSession();
		
		session.setAttribute("bookList", myList);
		
		RequestDispatcher rsp=request.getRequestDispatcher("/bookList.jsp");
		
		rsp.forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//	String book_name=req.getParameter("bookname");
//	String author=req.getParameter("author");
//	int price=Integer.parseInt(req.getParameter("price"));
//	
//	Books book=new Books();
//	book.setBookName(getString(book_name));
//	book.setAuthor(getString(author));
//	book.setPrice(getint(price));
		
		
Books book = new Books(0,req.getParameter("bookName"),req.getParameter("author"),Integer.parseInt(req.getParameter("price")));

	String status=bookService.insertBook(book)?"Success": "Failed";
	
	RequestDispatcher rsp=req.getRequestDispatcher("/index.html");
	
	PrintWriter out = resp.getWriter();
	out.println("<div class=\"item\">\n"
			+ "          <label><span>*</span> Insert status : "+status+"</label>\n"
			+ "        </div>");
	
	rsp.include(req, resp);
	
	}

}
