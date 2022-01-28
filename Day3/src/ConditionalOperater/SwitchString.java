package ConditionalOperater;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the State Code : ");
		String name =input.next();
		switch(name)
		{
		case "TN":
			System.out.println(name+" : is Tamil Nadu");
			break;
		case "KL":
			System.out.println(name+" : is Kerala");
			break;
		case "AP":
			System.out.println(name+" : is Andra Pradesh");
			break;
		case "G":
			System.out.println(name+" : is Goa");
			break; 
			
		default:
			System.out.println("Enter Valid Code");

	}
	}
}
