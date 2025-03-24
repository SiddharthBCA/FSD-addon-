package Session5;

public class Access_Person{

	public static void main(String[] args) {
		Person originalPerson = new Person("Siddharth", 19);
		
		//copied person Object
		Person copiedPerson = new Person(originalPerson);
		
		System.out.println("original person:");
		originalPerson.displayInfo();
		
		System.out.println("copied  Person:");
		copiedPerson.displayInfo();
	}
}
