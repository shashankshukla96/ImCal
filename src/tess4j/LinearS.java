package tess4j;

public class LinearS {
	char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	char op[] = {'+', '-', '*', '/' };
	
	public Boolean check(char c, char[] p)
	{
		for(int i = 0 ; i < p.length ; i++)
		{
			if(p[i] == c)
				return true;
		}
		return false;
	}
	public LinearS(String s1, String ch) throws InterruptedException
	{
		String s2[] = s1.split("=");
		String s = s2[0];
		int cons = 0 , coef = 0;
		
		System.out.println("Solving equation: ");
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(i == s.length()-1)
			{
				cons = Integer.parseInt(s.charAt(i)+"");
				if(s.charAt(i-1) == '-')
					cons *= -1;
			}
			else if(i!=0 && check(s.charAt(i), dig) &&  s.charAt(i+1) == ch.charAt(0))
			{
				coef = Integer.parseInt(s.charAt(i)+"");
				if(s.charAt(i-1) == '-')
					coef *= -1;
			}
			else if(i==0 && check(s.charAt(i), dig) &&  s.charAt(i+1) == ch.charAt(0))
			{
				coef = Integer.parseInt(s.charAt(i)+"");
			}
			else if(check(s.charAt(i), dig) &&  s.charAt(i+1) != ch.charAt(0))
			{
				cons = Integer.parseInt(s.charAt(i)+"");
				if(s.charAt(i-1) == '-')
					cons *= -1;
			}
			
		}
		if(s2[1].length() == 1)
		{
			cons -= Integer.parseInt(s2[1].charAt(0)+"");
		}
		cons *= 1;
		//System.out.println(cons);
		//System.out.println(coef);
		System.out.println("Find Out the contant and coefficients, \nTake all contants to the right side of the equation.");
		Thread.sleep(500);
		System.out.println("\n==> "+ coef + " * " + ch.charAt(0)+" = " + cons);
		Thread.sleep(1500);
		System.out.println("\nSend the coefficent to the right side.");
		Thread.sleep(500);
		System.out.println("\n==> " + ch.charAt(0) +" = " + (cons+0.0) +" / " + coef);
		Thread.sleep(1500);
		System.out.println("\nSolve Now: ");
		Thread.sleep(500);
		System.out.println("\n==> " + ch.charAt(0) +" = "+(cons+0.0)/coef);
	}
}
