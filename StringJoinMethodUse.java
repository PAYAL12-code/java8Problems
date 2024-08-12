package java8.com;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethodUse {
public static void main(String[] args) {
	
	List<String> nos = Arrays.asList("1","2","3");
	//if we want output in some pettern like 1-2-3
	String result  = String.join("-", nos);
	System.out.println(result);
}
}
