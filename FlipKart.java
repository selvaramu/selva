package exception;

public class FlipKart {

//	public static void main(String[] args) throws ProductNotFoundException {
//		int price=10000;
//		
//			if(price<=10000)
//			{
//				throw new ProductNotFoundException("no product");
//				}else {
//					System.out.println("product list");
//				}
//			}
//		
	public static void main(String[] args) {
		int price=10000;
		try {
			if(price<=10000) {
				throw new ProductNotFoundException("no product");
			}else {
				System.out.println("product list");
			}
		}
		catch(ProductNotFoundException e) {
			e.printStackTrace();
			System.out.println("products not");
		}
	}

}


