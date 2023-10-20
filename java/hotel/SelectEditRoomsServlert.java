package hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

/**
 * Servlet implementation class SelectEditRoomsServlert
 */
@WebServlet("/SelectEditRoomsServlert")
public class SelectEditRoomsServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectEditRoomsServlert() {
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
		
		String roomNumber=request.getParameter("roomID");
	
		boolean isTrue2;
		
		isTrue2 = hotelDButill.RoomValidation(roomNumber);
		if(isTrue2 == true) {
			
		
			try{	
				List<Rooms> Rooms = hotelDButill.RoomView(roomNumber);
				request.setAttribute("Rooms", Rooms);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("EditRooms.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Invalid Room Number!');");
			out.println("location='SelectEdit.jsp'");
			out.println("</script>");
		}
	}

}
