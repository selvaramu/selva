package exception;

public class StringIndexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String name="ram";
              try {
            	  System.out.println(name.charAt(12));
              }
              catch(StringIndexOutOfBoundsException e) {
            	  System.out.println(e+"not found");
            	  e.printStackTrace();
              }
	}

}
