package exception;

public class StackOverFlowExample2 {
   
	public void b() {
		a();
	}
	public void a() {
		b();
	}

	public static void main(String[]args) {
		StackOverFlowExample2  e=new StackOverFlowExample2();
		e.a();
	}
}
