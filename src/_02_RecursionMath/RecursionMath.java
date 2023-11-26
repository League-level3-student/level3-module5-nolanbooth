package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 
    	if(times == 1) {
    		return number;
    	}else {
    		
    		return number + recursiveMultiplication(number, times-1);
    	}

        // Else return number + recursiveMultiplication(number, times-1)


    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
        if(numberToDivideBy >= number) {
        	return number;
        }else {
        	number = number / numberToDivideBy;
        	return recursiveDivision(number, numberToDivideBy);
        	
        }
   
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        
        return 0;
    }
}
