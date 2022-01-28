package ConditionalOperater;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Month No : ");
		int number=input.nextInt();
		switch(number)
		{
		case 1:
			System.out.println(number+" : is January");
			break;
		case 2:
			System.out.println(number+" : is Feburary");
			break;
		case 3:
			System.out.println(number+" : is March");
			break;
		case 4:
			System.out.println(number+" : is April");
			break;
		case 5:
			System.out.println(number+" : is May");
			break;
		case 6:
			System.out.println(number+" : is June");
			break;
		case 7:
			System.out.println(number+" : is July");
			break;
		case 8:
			System.out.println(number+" : is Augest");
			break;
		case 9:
			System.out.println(number+" : is September");
			break;
		case 10:
			System.out.println(number+" : is October");
			break;
		case 11:
			System.out.println(number+" : is November");
			break;
		case 12:
			System.out.println(number+" : is December");
			break;
		default:
			System.out.println("Enter a valid number");
		}

	}

}
