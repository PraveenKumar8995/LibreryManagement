package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.service.Empservice;
import com.emp.bean.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Empservice es = new Empservice();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Employee> mylist = es.getlist();
		HttpSession session= request.getSession();
		session.setAttribute("EmployeeList",mylist);
		RequestDispatcher rsp=request.getRequestDispatcher("/EmployeeList.jsp");
		rsp.forward(request,response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest req,HTTPServletResponse response)throws ServletException,IOException{
		Employee ee=new Employee(0,req.getParameter("name"),Integer.parseInt(req.getParameter("salary")));
		String status=es.insertemp(ee)? "Success":"Failed";
		RequestDispatcher resp=((ServletRequest) resp).getRequestDispatcher("/index.html");
		resp.include(req,response);		
	}
	protected void doDelete(HttpServletRequest req,HTTPServletResponse response)throws ServletException,IOException{
		int id= Integer.parseInt(req.getParameter("id"));
		String status=es.deleteemp(id)? "Success":"Failed";
		ServletResponse resp;
		resp.setContentType("text");
		PrintWriter  out =resp.getWriter();
		out.println(id+" -Deleted Status is " +status);
	}
}

}
