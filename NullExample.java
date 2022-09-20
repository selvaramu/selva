package exception;

public class NullExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String name=null;
          try {
        	  System.out.println(name.length());
          }
          catch(NullPointerException e){
        	  // Exception e
        	  e.printStackTrace();
          
          System.out.println(e+"cant find length for null");
	}
	}

}
