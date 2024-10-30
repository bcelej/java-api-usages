package pl.bcelej.dev.java17;

public class MyInstanceOf {

	public static void main(String[] args) {
		// Instanceof with auto bind variable in condition, one line less to write

		Principal tester = new Tester();
		Principal user = new User();

		if (tester instanceof Tester foundTester) {
			System.out.println(foundTester);
		}

		if (user instanceof Tester foundUser) {
			System.out.println(foundUser.toString());
		}

	}

}
