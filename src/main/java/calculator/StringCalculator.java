package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	String[] no = input.split(",");
        
    	if(isEmpty(input)) {
    		return 0;
    	}
    	if(input.length() == 1){
    		
    		return stringToInt(input);
    		
    	}
    	else {
    		
    		return Integer.parseInt(no[0]) + Integer.parseInt(no[1]);
    		
    	}
		
   
    }

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

}
