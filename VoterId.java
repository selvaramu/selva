package exception;

public class VoterId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int age=17;
          try {
        	  if(age<=18) {
        		  throw new AgeNotFoundException("not eligible");
        	  }else {
        		  System.out.println("eligible");
        	  }
        	 
          }
          catch(AgeNotFoundException e) {
        	  e.printStackTrace();
        	  System.out.println("cant vote");
          }
	}

}
