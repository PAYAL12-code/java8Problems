package java8.com;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestStringInArray {

	public static void main(String[] args) {
		String value = "jav css springboot";
		String value1[] = value.split(" ");
		
	String maxvalue = 	Arrays.stream(value1).reduce((a1,a2)->a1.length()>a2.length()?a1:a2)
		.get();
		System.out.println(maxvalue);
		//if want min than a1.lenght<a2.length()?a1:a2
		
		//or 
		
		String[] s = {"jav","css","springboot"};
		
	String s1 = 	Arrays.stream(s)
		 .reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
		 .get();
	
	System.out.println(s1);
	
	
	//or
	 // Split the string into words and find the longest one
	String s11 = "ram is good boy";
    String longestWord = Arrays.stream(s11.split(" "))
                               .max(Comparator.comparingInt(String::length))
                               .orElse("");

    System.out.println("The longest word is: " + longestWord);
	}
	
}
