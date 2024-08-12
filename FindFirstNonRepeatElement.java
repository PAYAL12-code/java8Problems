package java8.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatElement {
public static void main(String[] args) {
	
	String s = "ilovejavaiooo"; 
	
String element =	Arrays.stream(s.split(""))
	.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	.entrySet()
	.stream()
	.filter(x->x.getValue()==1)
	.findFirst().get().getKey();
//we are using LinkedHashmap to preserved insersion oreder.
System.out.println(element);

   String FirstRepeateElement =	Arrays.stream(s.split(""))
      .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
  .entrySet()
 .stream()
 .filter(x->x.getValue()>1)
  .findFirst().get().getKey();
//we are using LinkedHashmap to preserved insersion oreder.
    System.out.println(FirstRepeateElement);
}
}
