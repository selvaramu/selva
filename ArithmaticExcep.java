package exception;

public class ArithmaticExcep {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int num=num1/num2;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			// Exception e
			System.out.println(e+"We cant divide 0 with any number");
		}

	}

}
