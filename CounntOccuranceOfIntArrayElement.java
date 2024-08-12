package java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CounntOccuranceOfIntArrayElement {
	public static void main(String[] args) {
        int[] a = {1, 2, 1, 4, 2, 2, 5, 4,6};

        
        //occurence of elemnet
        Map<Integer, Long> frequencyMap = Arrays.stream(a)
                                    .boxed()
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       //occurence of elemnt which have uinque 
  List<Integer> findunque =     Arrays.stream(a)
        .boxed()
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .filter(x->x.getValue()==1)
      .map(Map.Entry::getKey)
      .collect(Collectors.toList());

        frequencyMap.forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));
      
         System.out.println(findunque);
	}
}
