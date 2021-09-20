package AssignmentBridgelab.Day6;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumber {
	private static final Logger log= LogManager.getLogger(PrimeNumber.class);

	public static void main(String[] args) {  
		   Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = sc.nextInt();  
	       if (isPrime(n)) {  
	           log.info(n + " is a prime number");  
	       } else {  
	           log.info(n + " is not a prime number");  
	       }  
	       }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 

}
