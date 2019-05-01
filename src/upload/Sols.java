package upload;

import java.io.IOException;
import java.io.PrintWriter;
import com.sun.jna.Pointer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import net.sourceforge.tess4j.Tesseract;
/**
 * Servlet implementation class Sols
 */
@WebServlet("/Sols")
public class Sols extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		
		File image = new File("F://PROGRAMS//JAVA EE//IMCAL//Uploads//img.jpg");
		Tesseract instance = null;
		
		instance  = new Tesseract();
		instance.setDatapath("F:\\PROGRAMS\\JAVA EE\\IMCAL\\tessdata");
		
		try
		{
			String res = instance.doOCR(image);
			out.println(res);
		}catch(Exception e)
		{
			out.println(e.getMessage());
		}
	
	
	}
}
