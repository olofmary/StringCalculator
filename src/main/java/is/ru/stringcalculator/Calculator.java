package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers) throws RuntimeException{
    	int currNum = 0;
 	    int total = 0;

    	for(String number : numbers){
    		if (toInt(number) < 0){
    			throw new RuntimeException("Negatives are not allowed: ");
    		}
    	}

        for(String number : numbers){
        	currNum = toInt(number);
        	if(currNum < 1001){
        		 total += currNum;
        	}
		 
		}
		return total;
    }

    /*private static void checkForNegativeNumbers (String text){

    	String[] numbers = splitNumbers(text);
    	List NegativeNumbers = new ArrayList<>();

    	for (String number : numbers){
    		if(toInt(number) < 0){
    			NegativeNumbers.add(toInt(number));
    		}
    	}

    	if (NegativeNumbers.length > 0){
    		throw new RuntimeException ("Negatives are not allowed: ");
    	}
    }*/


}