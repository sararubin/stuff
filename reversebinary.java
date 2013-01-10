import java.util.Scanner;
/**
 * This program will take read an integer using stdin, reverse its binary string representation 
 * and output the resulting integer
 * @author sara
 * 
 */

public class reversebinary {

	public static int MAX_VALUE = 1000000000;	//max value of input integer
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	    int inputInt = -1;
		
		System.out.printf("Enter an integer between 1 and " +MAX_VALUE+ ": ");
	    while (inputInt <= 0 && input.hasNextInt()) {
    		inputInt = input.nextInt();
	    	if (inputInt >= 1 && inputInt <= MAX_VALUE) {	//check if integer is between given parameters
	    		String inputBin = Integer.toBinaryString(inputInt); //get binary string representation
	    		String outputBin = reverse(inputBin);				//call recursive function to get reversed bits
	    		int outputInt = Integer.parseInt(outputBin, 2);		//convert to int
	    		System.out.println(inputInt+ " reversed is: " +outputInt);	//print resulting integer output
	    	} else {
	    		System.out.printf("Error on input, please try again. Enter an integer between 1 and " +MAX_VALUE+ ": ");
	    	}
	    }
	       
	} //end of main

	//this function calls itself to reverse the bits a binary string representation
	//1101 becomes 1011
	public static String reverse(String bits) {
		if (bits.length() <= 1) {
			return bits;
		}
		return reverse(bits.substring(1, bits.length())) + bits.charAt(0);
	}

}
