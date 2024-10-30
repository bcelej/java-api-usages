package pl.bcelej.dev.java17;

import java.util.List;

public class NewVar {

	public static void main(String[] args) {
		// Added "var" type to declare variables in shorter way
		var myList = List.of("Zielony", "Czerwony", "Biały", "Czarny");
		myList.stream().forEach(System.out::println);

		// Use "var" in lambdas expressions
		boolean isThereBlack = myList.stream()
				.anyMatch((var s) -> s.equals("Czarny"));
		System.out.println(isThereBlack);
	}

}
