package AssignmentBridgelab.Day6;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerfectNumber {
	private static final Logger log= LogManager.getLogger(PerfectNumber.class);
	public static void main(String[] args) {

		int i, Number, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		log.info("\n Please Enter any Number: ");
		Number = sc.nextInt();
		sc.close();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			log.info("\n% d is a Perfect Number", Number);
		}
		else {
			log.info("\n% d is NOT a Perfect Number", Number);
		}
	}



}
