package Session5;

public class AbstractEmployee1  extends AbstractEmployee{
	
	@Override
	public void futureDesignation() {
		System.out.println("Full stack developer");
	}

	public void futureDesignation1() {
		System.out.println("Sid");
		
	}
public static void main(String[] args) {
	AbstractEmployee1 ae = new AbstractEmployee1();
	ae.name();
	ae.Designation();
	ae.futureDesignation();
	
}
}
