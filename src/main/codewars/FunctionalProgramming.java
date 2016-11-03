package main.codewars;

import java.util.function.Function;

public class FunctionalProgramming {

	public static Function<Student, Boolean> f = p -> p.getFullName().equals("John Smith") && p.getStudentNumber().equals("js123");

}