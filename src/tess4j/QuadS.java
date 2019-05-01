package tess4j;

public class QuadS {
	
	public QuadS(String s1, String ch) throws InterruptedException
	{
		String s[] = s1.split("=");
		int ai = 0, bi = 0;
		double a, b, c;
		System.out.println("Find out the Coefficients, a ,b and c.");
		Thread.sleep(1000);
		ai = s[0].indexOf(ch.charAt(0)+"2");
		a = Double.parseDouble(s1.charAt(ai-1)+"");
		bi = s[0].indexOf(ch.charAt(0), ai+1);
		b = Double.parseDouble(s1.charAt(bi-1)+"");
		c = Double.parseDouble(s[0].charAt(s[0].length()-1)+"");
		c = c - Double.parseDouble(s[1]);
		System.out.println("\n\na = " + a +"\tb = " + b +"\tc = " + c);
		Thread.sleep(1000);
		
		dhara(a, b, c);
	}
	
	public void dhara(double a, double b, double c) throws InterruptedException
	{
		double x1 = 0.0;
		double x2 = 0.0;
				
		double d = b*b - 4*a*c;
		
		System.out.println("\n\nFind out discriminant D = b*b - 4*a*c.");
		Thread.sleep(1000);
		
		d = Math.sqrt(d);
		
		System.out.println("\n\nUsing Dharacharya Formula");
		Thread.sleep(1000);
		
		x1 = (-1 * b - d) / (2*a);
		
		x2 = (-1 * b + d) / (2*a);
		System.out.println("\n\nWe have Two roots for this equation.");
		Thread.sleep(1000);
		
		System.out.println("a1 = " + x1);
		Thread.sleep(1000);
		System.out.println("a2 = " + x2);
	}
}
