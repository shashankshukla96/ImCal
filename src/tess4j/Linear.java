package tess4j;

import java.util.Stack;

public class Linear {
	 
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
	
	public Linear(String exp)
	{
		String []ex = exp.split("=");
		Stack<Integer> cf = new Stack<Integer>();
		String cns = "";
		String cfs = "";
		Stack<Character> c = new Stack<Character>();
		int coeff = 0, cons = 0;
		for(int i = 0 ; i < exp.length() ; i++)
		{
			if(check(exp.charAt(i), dig) && exp.charAt(i+1) != 'x' && !check(exp.charAt(i), dig))
			{
				cns += exp.charAt(i) ;
			}
			if(check(exp.charAt(i), dig) && exp.charAt(i+1) != 'x' && check(exp.charAt(i), dig))
			{
				cns += exp.charAt(i) ;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Linear("3x+4x*5x+6x=0");
	}

}
