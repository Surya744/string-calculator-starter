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
    		
    		return getSum(no);	
    		
    	}
		
    }
    
    private int getSum(String[] no) 
    {
    	int sum = 0;
    	for(String S: no)
    		sum += Integer.parseInt(S);
    	return  sum;
    }

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

}
