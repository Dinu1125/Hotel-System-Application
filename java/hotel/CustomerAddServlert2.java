package hotel;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerAddServlert2
 */
@WebServlet("/CustomerAddServlert2")
public class CustomerAddServlert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerAddServlert2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String hallType = request.getParameter("hallType");

		
		boolean isTrue2;
		
		isTrue2 =hotelDButill.CustomerValidation(nic);
		
		if(isTrue2 == false)
		{
			boolean isTrue;
			
			isTrue =hotelDButill.insertcustomer(nic,fname,lname,address,phone,email);
			
				if(isTrue==true) {
				RequestDispatcher dis = request.getRequestDispatcher("HallBooking.jsp");
			
				dis.forward(request, response);
				}
			
		}
		else
		{
			
			
			RequestDispatcher dis = request.getRequestDispatcher("HallBooking.jsp");
		
			dis.forward(request, response);
		}
	}

}
