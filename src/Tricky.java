/*
  	ISYS 320
  	Name(s): Gabriel Lopez
  	Date: 03/14/2018
*/

// 1. Your predicted output 
 

public class Tricky {
	 public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
}
	 
	 public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }
	}

// 3. Were you correct? Explain any differences
I was incorrect with my perdiction, i was message1, then message2, then message1, done with main then done with message 2

 

