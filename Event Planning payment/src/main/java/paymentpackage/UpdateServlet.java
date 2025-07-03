package paymentpackage;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paymentid=request.getParameter("paymentid");
		String eventid=request.getParameter("eventid");
		String eventname=request.getParameter("eventname");
		String eventdate=request.getParameter("eventdate");
		String amount=request.getParameter("amount");
		String status=request.getParameter("status");
		;
	
		
		boolean isTrue;
		isTrue = PaymentControl.updatedata(paymentid, eventid, eventname, eventdate, amount, status);
				
		
				if(isTrue==true) {
					List<PaymentModel> paymentdetails = PaymentControl.getById(paymentid);
					request.setAttribute("paymentdetails", paymentdetails);
					
					String alertMessage = "Data Update Succesful";
					response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='GetAllServlet'</script>");
				}
				else {
					RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
					dis2.forward(request, response);
				}		
	}
	}
		


