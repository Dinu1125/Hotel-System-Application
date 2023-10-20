package hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RoomBookingServlet")
public class RoomBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomBookingServlet() {
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
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
				
		String roomType = request.getParameter("roomType");
		String arrival = request.getParameter("Adate");
		String departure = request.getParameter("Ddate");
		String roomNumber = request.getParameter("roomid");
		String nights = request.getParameter("nights");
		String adults = request.getParameter("adults");
		String childern = request.getParameter("children");
		String nic = request.getParameter("nic");
		
		String type1="Single";
		String type2="Double";
		String type3="Deluxe";
		
		out.println(roomType);

		boolean isTrue;
		
		
		isTrue = hotelDButill.Booking(roomType, roomNumber, arrival, departure, nights, adults, childern,nic);
		
		if(isTrue==true) {
			
			boolean isTrue2;
			isTrue2=hotelDButill.updateroomStatus(roomNumber);
			
			if(isTrue2==true)
			{
	
				int conNights = Integer.parseInt(nights);
				int price = 0;
				
				if(roomType.equals(type1))
				{
					
					try{	
						price=99*conNights;
						request.setAttribute("price", price);
					}catch(Exception e) {
						e.printStackTrace();
					}
						
						RequestDispatcher dis = request.getRequestDispatcher("Payment.jsp");
						dis.forward(request, response);
				}
				else if(roomType.equals(type2))
				{
					
					
					try{	
						price=149*conNights;
						request.setAttribute("price", price);
					}catch(Exception e) {
						e.printStackTrace();
					}
						
						RequestDispatcher dis = request.getRequestDispatcher("Payment.jsp");
						dis.forward(request, response);
				}
				else if(roomType.equals(type3))
				{
					
					try{	
						price=199*conNights;
						request.setAttribute("price", price);
					}catch(Exception e) {
						e.printStackTrace();
					}
						
						RequestDispatcher dis = request.getRequestDispatcher("Payment.jsp");
						dis.forward(request, response);
				}
				
		}
		}
	
	}
}
