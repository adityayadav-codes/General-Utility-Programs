import java.util.*;
// Removes Duplicates From Array 

public class Demo {
	
	public static void main(String [] args) {

		int [] arr = {1,2,3,2,4,1};

		HashSet <Integer> set = new HashSet<>();

		for(int i : arr) {

			set.add(i);
		}

		System.out.println(set);
	}
}

