package paymentpackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventid=request.getParameter("eventid");
		String eventname=request.getParameter("eventname");
		String eventdate=request.getParameter("eventdate");
		String amount=request.getParameter("amount");
		String status=request.getParameter("status");
		
		
		boolean isTrue;
		
		isTrue = PaymentControl.insertdata(eventid, eventname, eventdate, amount, status);
		if(isTrue==true) {
			String alertMessage = "Data Insert Succesful";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='GetAllServlet'</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request,response);
		}
		
		if(eventid.isEmpty() || amount.isEmpty()) {
		    request.setAttribute("error", "Fields cannot be empty");
		    RequestDispatcher dispatcher = request.getRequestDispatcher("insert.jsp");
		    dispatcher.forward(request, response);
		    return;
		}

	}



}
