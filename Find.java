package exception;



public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           int a=10;
           
           int b=0;
           String name=null;
           int[] nums= {2,3,4,5};
           try {
        	   int c=a/b;
        	   System.out.println(c);
        	   System.out.println(name.length());
        	   System.out.println(nums[7]);
        	   
           } 
           catch(ArithmeticException ae) {
        	   ae.printStackTrace();
        	   System.out.println("cant divide with zero");
           }
           catch(NullPointerException ne) {
        	   ne.printStackTrace();
        	   System.out.println("given String is empty");
           }
           catch(ArrayIndexOutOfBoundsException are) {
        	   are.printStackTrace();
        	   System.out.println("mention valid array");
           }
        	   
           }
	}


