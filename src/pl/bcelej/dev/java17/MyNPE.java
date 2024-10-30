package pl.bcelej.dev.java17;

public class MyNPE {

	public static void main(String[] args) {
		User myUser = new User();
		System.out.println(myUser.getFirstName().length());
	}

}
