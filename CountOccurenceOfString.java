package java8.com;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfString {
public static void main(String[] args) {
	String s = "ilovejava"; 
	
	Map<String,Long> map = Arrays.stream(s.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	
	
}
}
