public class ExceptionHandling {

	/** @return s repeated n times
	  * @param n should be non-negative
	  */
	public static String repeat(String s, int n) {
	    if(n < 0){
	        throw new IllegalArgumentException(
			"Cannot repeat a  string " + n + " times");
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	    	sb.append(s);
		}
	    return sb.toString();
	}
	
	public static String progressBar(int width, double percent){
		int numChars = (int) (Math.floor((width-2) * percent));
		return "[" + repeat("X", numChars) + repeat(" ", width-2-numChars) + "]";
	}
		
	public static void main(String[] args){
		try{
		    System.out.println(progressBar(14, 0.5));
		}
		catch (IllegalArgumentException iae){
		    System.err.println(iae.getMessage());
		}
	}
}
