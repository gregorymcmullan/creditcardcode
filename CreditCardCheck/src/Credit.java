import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Credit
	{
		static long ccv = (long) 5424180123456789.;
		static long ccinv = (long) 5424180123456788.;
		static long digits;
		static long remainder;
		static long[] validNumbers = new long[16];

		public static void main(String[] args)
			{
int totalLines = 0;
int lineNumber=0;


try {
	Scanner file = new Scanner(new File("cardnumber.txt"));
	while(file.hasNextLong()) {
		
		lineNumber++;
		long ccn = file.nextLong();
		if(luhnCheck(ccn)) {
			System.out.println(ccn);
			totalLines++;
		}
	}

}catch(FileNotFoundException e) {
	e.printStackTrace();
}

System.out.println("the list has " + totalLines);






			}

public static boolean luhnCheck(long ccn) {
	return false;
	
}
	}
