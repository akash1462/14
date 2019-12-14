package empl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Department[] = {"Information Technology", "Computers", "HR"};
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Employee emp = new Employee();
		emp.setEmployeeid("969143");
		emp.setEmployeename("John");
		emp.setGender("male");
		emp.setDepartment("Information Technology");
		emp.setSalary("120000");
		try {
			emp.setDateOfBirth(dateFormat.parse("08/07/1987"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		emp.setFullTimeEmployee("FullTimeEmployee");

		request.setAttribute("emp", emp);
		request.setAttribute("Department", Department);
		
		RequestDispatcher rd = request.getRequestDispatcher("edit-employee.jsp");
		rd.forward(request, response);
	}

}
