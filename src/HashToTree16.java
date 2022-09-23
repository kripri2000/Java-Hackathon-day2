/*
Hashset - elts are in order of hashcode
Treeset - in sorted order
*/

import java.util.*;
public class HashToTree16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<String>();
		hashset.add("hello");
		hashset.add("world");
		hashset.add("hi");
		hashset.add("apple");
		System.out.println(hashset);
		Set<String> hashtotree = new TreeSet<String>(hashset);
		System.out.println(hashtotree);
		
	}

}
