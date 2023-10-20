package hotel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerAddservlert
 */
@WebServlet("/CustomerAddservlert")
public class CustomerAddservlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerAddservlert() {
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
		String roomType = request.getParameter("roomType");

		
		boolean isTrue2;
		
		isTrue2 =hotelDButill.CustomerValidation(nic);
		
		if(isTrue2 == false)
		{
			boolean isTrue;
			
			isTrue =hotelDButill.insertcustomer(nic,fname,lname,address,phone,email);
			
			
			
			if(isTrue == true) {
				
				try{	
					List<Rooms> Rooms = hotelDButill.AvlRooms(roomType);
					request.setAttribute("Rooms", Rooms);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher dis = request.getRequestDispatcher("RoomBooking.jsp");
			
				dis.forward(request, response);
				
			} else {
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
		}
		else {
			
			
			
			try{	
				List<Rooms> Rooms = hotelDButill.AvlRooms(roomType);
				request.setAttribute("Rooms", Rooms);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("RoomBooking.jsp");
		
			dis.forward(request, response);
		}
	}

}
