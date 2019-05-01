package tess4j;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class test {
	
	public static void main(String[] args) throws Exception
	{
		File image = new File("F:/PROGRAMS/JAVA EE/IMCAL/Uploads/Untitled.jpg");
		
		ITesseract instance  = new Tesseract();
		instance.setDatapath("F:/PROGRAMS/JAVA/Tesseract/tessdata");
		
		try
		{
			String res = instance.doOCR(image);
			System.out.println(res);
			if(res.contains("a"))
			{
				if(res.contains("a2"))
					new QuadS(res, "a");
				else
					new LinearS(res, "a");
			}
			if(res.contains("A"))
			{
				if(res.contains("A2"))
					new QuadS(res, "A");
				else
					new LinearS(res, "A");
			}
			else
			{
				new Solve(res);
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
