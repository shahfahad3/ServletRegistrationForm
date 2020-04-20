import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class RegForm extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Details of the Registered User";
      
      out.println(
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Name</b>: "
                  + request.getParameter("Name") + "\n" +
                  "  <li><b>DOB</b>: "
                  + request.getParameter("Birthday_day") +" " + request.getParameter("Birthday_Month") +" " + request.getParameter("Birthday_Year") +"\n" +
                  "  <li><b>EMail</b>: "
                  + request.getParameter("Email_Id") + "\n" +
               
                  "  <li><b>Phone</b>: "
                  + request.getParameter("Mobile_Number") + "\n" +
                  "  <li><b>Gender</b>: "
                  + request.getParameter("Gender") + "\n" +
				  
                  "  <li><b>Address</b>: "
                  + request.getParameter("Address") +"," + request.getParameter("City") +"," + request.getParameter("Pin_Code")+ "," + request.getParameter("State") +"," + request.getParameter("Country")+  "\n" +
				  
				  "  <li><b>Qualifications</b>: "+"<br>"+
				  "Class X: \n"+
                   request.getParameter("ClassX_Board") +"," + request.getParameter("ClassX_Percentage") +"%," + request.getParameter("ClassX_YrOfPassing")+   "\n" +
				  
				  "		<br>ClassXII:\n "+
                   request.getParameter("ClassXII_Board") +"," + request.getParameter("ClassXII_Percentage") +"," + request.getParameter("ClassXII_YrOfPassing")+   "\n" +
				  
				  "		<br>Graduation: \n"+
                   request.getParameter("Graduation_Board") +"," + request.getParameter("Graduation_Percentage") +"%," + request.getParameter("Graduation_YrOfPassing")+   "\n" +
				  
				  "		<br>Masters: \n"+
                   request.getParameter("Masters_Board") +"," + request.getParameter("Masters_Percentage") +"%," + request.getParameter("Masters_YrOfPassing")+   "\n" +
				  "<li><b>Experience</b>: "+
                   request.getParameter("Experience") +"\n"+
				  
				  
				  "</ul>\n" +
            "</body>" +
         "</html>"
      );
   }
}