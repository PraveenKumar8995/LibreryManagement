package ConditionalOperater;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse A String
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Character : ");
		String old=input.next();
		String newstring="";
		for(int i=old.length()-1;i>=0;i--)
		{
			newstring=newstring+old.charAt(i);
		}
		System.out.println("Charcter Before Reversal : "+old);
		System.out.println("Character after reversal : "+newstring);

	}

}
