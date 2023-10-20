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
 * Servlet implementation class ViewCustomerServlert
 */
@WebServlet("/ViewCustomerServlert")
public class ViewCustomerServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerServlert() {
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
		
		String nic=request.getParameter("nic");
	
		boolean isTrue2;
		
		isTrue2 = hotelDButill.CustomerValidation(nic);
		if(isTrue2 == true) {
			
		
			try{	
				List<Customer> customer = hotelDButill.CoustomerDetails(nic);
				request.setAttribute("customer", customer);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("CustomerSelect.jsp");
			dis.forward(request, response);
		}
		else 
		{
			out.println("<script type='text/javascript'>");
			out.println("alert('Unregistered Customer!');");
			out.println("location='CustomerSelect.jsp'");
			out.println("</script>");
		}
	}

}
