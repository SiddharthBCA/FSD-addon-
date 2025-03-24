package Session5;

public class AccessBird_Action extends Bird implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("Bird flys...");
	
	}
	
	public static void main(String[] args) {
		
		AccessBird_Action aba = new AccessBird_Action();
		aba.eat();
		aba.fly();
	}

}
