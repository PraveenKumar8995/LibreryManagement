package sample.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sample.com.Model.*;
import sample.com.service.*;

@WebServlet("/books")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BookService bookService = new BookService();
   
    public BookServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Books> myList = bookService.getBookList();
    	
    	HttpSession session = request.getSession();
    	
    	session.setAttribute("bookList", myList);
    	
		RequestDispatcher rsp = request.getRequestDispatcher("/bookList.jsp");
    	
		rsp.forward(request, response);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
