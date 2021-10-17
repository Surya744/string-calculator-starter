package calculator;

class StringCalculator {
	
	private final String delimiter = ",|\n";

    public int add(String input) {
    	
    	String[] no = input.split(delimiter);
        
    	if(isEmpty(input)) {
    		return 0;
    	}
    	if(input.length() == 1){
    		
    		return stringToInt(input);
    		
    	}
    	else {
    		
    		return getSum(no[0],no[1]);
    		
    	}
		
    }
    
    private int getSum(String numA, String numB) {
    	return  Integer.parseInt(numA) + Integer.parseInt(numB);
    }

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

}
