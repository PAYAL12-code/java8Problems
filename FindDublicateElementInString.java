package java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateElementInString {
public static void main(String[] args) {
	String s = "ilovejava"; 
	
	List<String> dublicat=Arrays.stream(s.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    .entrySet().stream()
    .filter(x->x.getValue()>1)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());
	
	System.out.println(dublicat);
	
	List<String> unique=Arrays.stream(s.split(""))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		    .entrySet().stream()
		    .filter(x->x.getValue()==1)
		    .map(Map.Entry::getKey)
		    .collect(Collectors.toList());
	
	System.out.println(unique);
}
}
