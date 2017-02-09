import java.util.*;
public class Parenthesis
{
	
	Scanner in = new Scanner(System.in);
	Stack<Integer> stack = new Stack<Integer>();
	public boolean check()
	{
		System.out.println("Please enter your expression.");
		String newExp = in.nextLine();//in.next();
		String[] exp = new String[newExp.length()];
		for (int i=0;i<newExp.length();i++)
		{ 
			char ch = newExp.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{')
			stack.push(i);
			else if (ch == ')'|| ch == ']' || ch == '}')
			{
				//nothing to match with
				if(stack.isEmpty())
				{  
					System.out.println("Empty");
					//return false;
				}
				else if(stack.pop() != ch)
				{ 
					System.out.println("AA");
					return false;
				} 
			}            
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Parenthesis p=new Parenthesis();
		p.check();
	}
	
	
}

