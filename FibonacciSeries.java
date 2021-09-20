package AssignmentBridgelab.Day6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibonacciSeries {
	private static final Logger log= LogManager.getLogger(FibonacciSeries.class);
	public static void main( String args[] ) {
		int number1 = 0;
		int number2 = 1;
		int sum;
		int total = 15;

		log.info(number1);

		for(int i=1;i<total;++i){

			sum = number1 + number2;
			log.info(", " + number2);
			number1 = number2;
			number2= sum;   

		}

	}

}
