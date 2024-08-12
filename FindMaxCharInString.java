package java8.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxCharInString {

	public static void main(String[] args) {
 String s = "javaerrravvvv";
   Map<String,Long> ma=Arrays.stream(s.split(""))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    ;
   
  List<String> maxv = ma.entrySet().stream()
   .filter(x->x.getValue()==Collections.max(ma.values()))
   .map(Map.Entry::getKey)
   .collect(Collectors.toList());
   System.out.println("max value="+maxv);
   
   List<String> min = ma.entrySet().stream()
		   .filter(x->x.getValue()==Collections.min(ma.values()))
		   .map(Map.Entry::getKey)
		   .collect(Collectors.toList());
		   System.out.println("min value="+min);
		   
   
 
	}
	
}
