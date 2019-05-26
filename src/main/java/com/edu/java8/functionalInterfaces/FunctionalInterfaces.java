package com.edu.java8.functionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 * Created by Ukropchik on 02.05.2017.
 */
public class FunctionalInterfaces {
	public static void main(String[] args) {
		//Supplier
		System.out.println("\nSupplier");
		Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
		System.out.println(dateSupplier.get());

		Supplier<ArrayList<String>> listSupplier = ArrayList<String>::new;
		Supplier<ArrayList<String>> listSupplier2 = () -> new ArrayList<>();
		ArrayList<String> strings = listSupplier2.get();
		strings.add("Hello World!");
		System.out.println(strings);
		strings.stream().forEach(e -> System.out.println(e));

		//Consumer and BiConsumer
		System.out.println("\nConsumer and BiConsumer");
		StringBuilder sb = new StringBuilder();
		Consumer<String> builderConsumer = e -> sb.append(e);
		builderConsumer.accept("Hello_");
		builderConsumer.accept("World_!");
		System.out.println(sb);

		Map<String, String> map = new HashMap<>();
		BiConsumer<String, String> mapBiConsumer = (k, v) -> map.put(k, v);
		mapBiConsumer.accept("John", "Programmer");
		mapBiConsumer.accept("Lisa", "Accountant");
		System.out.println(map);


		//Predicate and BiPredicate
		System.out.println("\nPredicate and BiPredicate");

		Predicate<String> predicate = e -> e.contains("n");
		Predicate<String> predicate1 = e -> e.contains("a");
		System.out.println(predicate.test("Anna"));
		System.out.println(predicate.test("Anita"));

		Predicate<String> predicate2 = String::isEmpty;
		System.out.println(predicate2.test(""));

		BiPredicate<String, String> biPredicate = (string, prefix) -> string.startsWith(prefix);
		System.out.println(biPredicate.test("asd", "s"));
		System.out.println(biPredicate.test("asd", "a"));

		Predicate<String> predicate3 = predicate.and(predicate1);
		System.out.println(predicate3.test("Anna"));

		Predicate<String> predicate4 = predicate.and(predicate1.negate());
		System.out.println(predicate4.test("Nin"));

		//Function and BiFunction
		System.out.println("\nFunction and BiFunction");
		Function<String, Integer> function1 = String::length;
		System.out.println(function1.apply("qwerty"));

		BiFunction<String, String, String> biFunction1 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(biFunction1.apply("Chuck_", "Norris"));

		//UnaryOperator and BinaryOperator
		System.out.println("\nUnaryOperator and BinaryOperator");
		UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
		System.out.println(unaryOperator.apply("qwerty"));
		BinaryOperator<String> binaryOperator = (string, toAdd) -> string.concat(toAdd);
		System.out.println(binaryOperator.apply("The ", "Beatles"));

	}
}
