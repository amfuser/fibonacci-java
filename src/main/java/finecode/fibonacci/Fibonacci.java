package co.finecode.fibonacci;

class Fibonacci { 
    public static void main(String args[]) { 
    	Integer numberOfSeq = Integer.parseInt(args[0]);
        run(numberOfSeq); 
    } 
    
    public static void run(Integer numberOfSeq) {
    	
    	int nth1 = 0;
    	int nth2 = 0;
    	int nth3 = 0;
    	
    	for(int i = 0; i < numberOfSeq; i++) {
    		if(i < 1) {
    			nth1 = i;
    			nth2 = i + 1;
    			System.out.print(i + " ");		
    			continue;
    		}
    		else {
    			nth3 = nth2 + nth1;
    			nth2 = nth1;
    			nth1 = nth3;
    			System.out.print(nth3 + " ");
    		}
    	}
    }
 } 
