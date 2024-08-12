package java8.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateCharInString {
	public static void main(String[] args) {
        String s = "ram is good boy";

        // Split the string into words and find the longest one
        String longestWord = Arrays.stream(s.split(" "))
                                   .max(Comparator.comparingInt(String::length))
                                   .orElse("");

        System.out.println("The longest word is: " + longestWord);
    
	
}
}
