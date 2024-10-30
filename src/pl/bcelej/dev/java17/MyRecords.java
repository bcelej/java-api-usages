package pl.bcelej.dev.java17;

public class MyRecords {

	public static void main(String[] args) {
		// Record is a type designed to store some data
		// In other words, it’s roughly equivalent to Lombok’s @Value. In terms of language, it’s kind of similar to an enum.
		// Like enum, it can’t extend or be extended by other classes, but it can implement an interface and have static fields and methods.
		record User(String firstName, String lastName, String position){}
		User testUser = new User("Jan", "Kowalski", "Automation tester");
		System.out.println(testUser);
		System.out.println(testUser.firstName());

	}

}
