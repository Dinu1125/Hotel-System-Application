package hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRoomsServlert
 */
@WebServlet("/AddRoomsServlert")
public class AddRoomsServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoomsServlert() {
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
		
		String RoomID = request.getParameter("roomID");
		String RoomType = request.getParameter("roomType");
		
		boolean isTrue2;
		
		isTrue2 = hotelDButill.RoomValidation(RoomID);
		if(isTrue2 == false) {
			
		boolean isTrue;
		
		isTrue =hotelDButill.AddRooms(RoomID, RoomType);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Room Added!');");
			out.println("location='AddRooms.jsp'");
			out.println("</script>");
		}
		
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Already In This Room Number!');");
			out.println("location='AddRooms.jsp'");
			out.println("</script>");
		}
	}

}
