package java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementStartWith1 {
public static void main(String[] args) {
	
	int arr[] = {5,11,23,34,1};
	// Convert IntStream to Stream<Integer>
	
	List<String> l = Arrays.stream(arr).boxed()
	.map(s->s+"")
	.filter(s->s.startsWith("1"))
	.collect(Collectors.toList());
	
	System.out.println(l);
	
    for(int i=0;i<arr.length;i++) {
    	int n  = i;
    	int mod = n/10;
    	if(mod == 1) {
    		System.out.println(i);
    	}
    }
	
}
}
