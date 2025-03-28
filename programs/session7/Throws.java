package session7;

public class Throws {
	
	public static int divideNumber(int m, int n) throws
	ArithmeticException, ArrayIndexOutOfBoundsException{
		
		int div = m/n;
		
		String[] name = {"java", "python", "node"};
		System.out.println(name[2]);
		
		return div;
	}
	
	public static void main(String[] args) {
		Throws te = new Throws();
		
		try {
			System.out.println(divideNumber(45,9));
			
		}catch(ArithmeticException e) {
			System.out.println("\n Number cannot be divide by 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
			
		}
		
		
	}

}
