

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestPostForm")
public class RequestPostForm extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 req.setCharacterEncoding("UTF-8");
		 String name=req.getParameter("user_name");
		 String email=req.getParameter("user_email");
		 String password=req.getParameter("user_password");
		 String age=req.getParameter("user_age");
		 String bio=req.getParameter("user_bio");
		 String job=req.getParameter("user_job");
		 
		 String[] interest=req.getParameterValues("user_interest");
		 
		 System.out.println(name);
		 System.out.println(email);
		 System.out.println(password);
		 System.out.println(age);
		 System.out.println(bio);
		 System.out.println(job);
		 
		 for(String ints:interest) {
			 System.out.println(ints);
		 }
		 
		 List<String> interest1=Arrays.asList(interest);
		 
		 Person1 person=new Person1(name, email, password,age,bio,job,interest1);
		 req.setAttribute("myPerson",person);
		 
		 RequestDispatcher dispatcher=req.getRequestDispatcher("login1.jsp");
		 dispatcher.forward(req,res);
	
	}

}
