package hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AvlRoomsServlet
 */
@WebServlet("/AvlRoomsServlet")
public class AvlRoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvlRoomsServlet() {
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
		
		String single="Single";
		String dou_ble="Double";
		String deluxe="Deluxe";
		
		try{	
			int AvlSingleRooms = hotelDButill.roomCount(single);
			request.setAttribute("AvlSingleRooms", AvlSingleRooms);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try{	
			int AvlDoubleRooms = hotelDButill.roomCount(dou_ble);
			request.setAttribute("AvlDoubleRooms", AvlDoubleRooms);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try{	
			int AvlDeluxeRooms = hotelDButill.roomCount(deluxe);
			request.setAttribute("AvlDeluxeRooms", AvlDeluxeRooms);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
			dis.forward(request, response);
	}

}
