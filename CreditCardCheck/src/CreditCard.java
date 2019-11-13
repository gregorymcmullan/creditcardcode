import java.util.Scanner;

public class CreditCard
	{

		public static void main(String[] args)
			{
				greetUser();
				creditCardIntake();
			
			}
public static void greetUser() {
	System.out.println("hello");
}
	public static void creditCardIntake() {
		
		System.out.println("these are two different credit card numbers the one on the top is valid the bottom one is invalid");
		long ccv=(long) 5424180123456789.;
		long ccInv=(long) 5424180123456788.;
		long yourNumber =0;
		int length=16;
		long lastDigit=0;
		long remainder = 0;
		System.out.println(ccv);
	System.out.println(ccInv);
	Scanner putCardNumber = new Scanner(System.in);
	System.out.println("please create your own credit car number and I will see if it is valid");
	long[] cardNumber = new long[1];
	for(int i=0;i<cardNumber.length;i++) {
		for(int j =0;j<cardNumber.length;j++) {
			
		
		cardNumber[i]=putCardNumber.nextLong();
	yourNumber = cardNumber[i];
	
	}
		System.out.println();
	}
	System.out.println("your number is " + yourNumber );
	int cardLength=16;
	int[] nums = new int[16];

	for(int i = length-1;i<cardNumber.length;i++) {
		 lastDigit=yourNumber%10;
		 remainder = yourNumber/10;
		 System.out.println(lastDigit );
		 System.out.println(remainder);
	}
	
	}
	
		
	}
