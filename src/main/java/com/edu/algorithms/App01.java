package com.edu.algorithms;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App01 {

	public static void main(String[] args) {
		String line = "Jonson";

		int x = 121;

		List<Character> list = line.toLowerCase().chars().mapToObj(s -> (char) s).collect(Collectors.toList());

		Map<Character, Integer> result = defineNumbersOfEachSymbol(list);

		result.forEach((k, v) -> System.out.println("character \"" + k + "\" meets " + v + " times"));

	}

	private static Map<Character, Integer> defineNumbersOfEachSymbol(List<Character> symbols) {
		Map<Character, Integer> map = new TreeMap<>();
		Set<Character> keys = map.keySet();

		for (Character symbol : symbols) {
			if (map.containsKey(symbol)) {
				int value = map.get(symbol).intValue();
				map.put(symbol, ++value);
			} else {
				map.put(symbol, 1);
			}
		}
		return map;
	}

}
