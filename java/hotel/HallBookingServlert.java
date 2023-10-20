package hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HallBookingServlert
 */
@WebServlet("/HallBookingServlert")
public class HallBookingServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HallBookingServlert() {
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
		
		String hallType = request.getParameter("hallType");
		String guests = request.getParameter("guests");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String hours = request.getParameter("hours");
		String nic = request.getParameter("nic");
		
		
		int price=0;
		

		boolean isTrue;
		
		
		isTrue = hotelDButill.HallBooking(hallType, guests, date, time, hours, nic);
		
		if(isTrue==true)
		{
			if(hallType.equals("Deewan Banquet Hall"))
			{
				int conhours = Integer.parseInt(hours);
				try{	
					price=1500*conhours;
					request.setAttribute("price", price);
				}catch(Exception e) {
					e.printStackTrace();
				}
					
					RequestDispatcher dis = request.getRequestDispatcher("Payment2.jsp");
					dis.forward(request, response);
			}
			else if(hallType.equals("Louvre Banquet Hall"))
			{
				
				int conhours = Integer.parseInt(hours);
				try{	
					price=1000*conhours;
					request.setAttribute("price", price);
				}catch(Exception e) {
					e.printStackTrace();
				}
					
					RequestDispatcher dis = request.getRequestDispatcher("Payment2.jsp");
					dis.forward(request, response);
			}
		
		}
	}

}
