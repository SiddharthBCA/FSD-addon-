package Session5;

public class Accessfoodmenu implements Vegitems, Nonvegitems {

	@Override
	public void fry() {
		System.out.println("Chicken fry, Prawn fry, Mutton fry");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken chukka, chetinadu gravy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakFast() {
		System.out.println("Idly, dosa, vadai, puri");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunch() {
		System.out.println("biriyani, meals");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		 Accessfoodmenu afm = new  Accessfoodmenu();
		 afm.breakFast();
		 afm.lunch();
		 afm.fry();
		 afm.gravy();
		
		
	}

}
