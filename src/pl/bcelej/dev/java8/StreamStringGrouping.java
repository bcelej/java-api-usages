package pl.bcelej.dev.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamStringGrouping {

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "fig", "grape", "orange");
		//String group by length
		Map<Integer, List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupedWords);

		//printing nodes
		for (Map.Entry<Integer, List<String>> entry : groupedWords.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		//printing keys with stream
		groupedWords.keySet().stream().forEach(key -> System.out.println(key));

		//String group by length and count items
		Map<Integer, Long> groupedAndCountedWords = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(groupedAndCountedWords);

		//Do this with parallel and shared ForkJoinPool threads pool
		Map<Integer, List<String>> groupedWordsParallel = words.parallelStream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupedWordsParallel);

		//Standard java api
		Map<Integer, List<String>> groups = new HashMap<>();
		words.forEach(
				word -> {
					groups.compute(word.length(), (integer, list) -> {
						List<String> newList = list != null ? list : new ArrayList<>();
						newList.add(word);
						return newList;
					});
				});
		System.out.println(groups);
	}

}
