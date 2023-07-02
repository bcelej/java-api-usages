package pl.bcelej.dev;

import java.io.File;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		//Sum numbers
		Stream<Integer> numbers = Stream.of(10, 20, 30, 40, 50, 99);
		int sum = numbers.filter(n -> n % 2 == 0).reduce(0, Integer::sum);
		System.out.println(sum);

		//More effectivelly with simple type
		IntStream numbersAsSimple = IntStream.of(10, 20, 30, 40, 50, 60, 81, 99);
		int sumNumbers = numbersAsSimple.reduce(0, Integer::sum);
		System.out.println(sumNumbers);

		//Create an empty strema
		Stream<String> empty1 = Stream.empty();
		IntStream empty2 = IntStream.of(new int[]{});
		IntStream empty3 = Arrays.stream(new int[]{});
		System.out.println(empty1.findAny().isEmpty());
	}

}
