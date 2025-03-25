package session6;

public class Exceptions {

	String str1 = "1234";//instance varaiable 
	
	public void name() {
		try {
			
			int i = Integer.parseInt(str1);
			System.out.println("The value of converted String:"+str1);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
	
	private void printStackTrace() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Exceptions ee = new Exceptions();
		ee.name();
	}
}
