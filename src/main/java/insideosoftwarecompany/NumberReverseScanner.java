package insideosoftwarecompany;

import java.util.Scanner;

public class NumberReverseScanner {

	public static void main(String[] args) {
	
		int givennumber=0;
		int reve=0;
		System.out.println("enter the number to reverse");
	
		Scanner scanner = new Scanner(System.in);
		givennumber=scanner.nextInt();
		
		while (givennumber!=0) {
			reve=reve*10;
			reve=reve+givennumber%10;
			givennumber=givennumber/10;
					
		}
		
		System.out.println(reve);
	}

}
