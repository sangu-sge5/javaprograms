package insideosoftwarecompany;

public class NumberReverse {

	public static void main(String[] args) {

		int givennumber=1234;
		int rev=0;

		while (givennumber!=0) {

			rev=rev*10;
			rev=rev+givennumber%10;
			givennumber=givennumber/10;
		}
		System.out.println(rev);

	}

}
