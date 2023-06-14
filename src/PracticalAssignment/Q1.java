package PracticalAssignment;

import java.util.Arrays;
import java.util.Stack;
public class Q1 {
	public static String Reverse(String str)
	{
	char [] ReverseString = new char [str.length()];
	Stack <Character> stack = new Stack <Character>();
	for (int i=0; i<str.length(); i++) {
	stack.push(str.charAt(i));
	}
	int i=0;
	while(!stack.isEmpty())
	{
	ReverseString[i++]=stack.pop();
	}
	return new String (ReverseString);
	} 

	public static void main(String[] args) {
		String str1 = "Welcome To";
		System.out.println("Reverse of" + " "+str1 + "=" +Reverse(str1) );

	}

}
