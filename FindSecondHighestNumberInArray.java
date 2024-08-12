package java8.com;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumberInArray {
	public static void main(String[] args) {
		int[] arr= {5,9,11,2,8,21,1};
		
	Integer intger =	Arrays.stream(arr).boxed()//we did autoboxing
		.sorted(Comparator.reverseOrder())
		.skip(1)//if we take 2 like skip(2) so we get 3 higest element in array which i s9
		.findFirst()
		.get();
		System.out.println(intger);
		//if want assending order 2 hisest than
		
		Integer intger1 =	Arrays.stream(arr).boxed()//we did autoboxing
				.sorted()
				.skip(1)
				.findFirst()
				.get();
				System.out.println(intger1);
	}

}
