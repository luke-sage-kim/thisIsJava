package testPage521;

import java.util.Arrays;
//배열 비교
public class SortExample {

	 public static void main(String[] args) {

	  int[] scores = { 99, 97, 98 };

	  Arrays.sort(scores);

	  for(int i=0; i<scores.length; i++) {

	   System.out.println("scores[" + i + "]=" + scores[i]);

	  }

	  System.out.println();

	  

	  String[] names = { "티스토리", "블로그", "알통몬" };

	  Arrays.sort(names);

	  for(int i=0; i<names.length; i++) {

	   System.out.println("names[" + i + "]=" + names[i]);

	  }

	  System.out.println();

	  

	  Member m1 = new Member("티스토리");

	  Member m2 = new Member("블로그");

	  Member m3 = new Member("알통몬");

	  Member[] members = { m1, m2, m3 };

	  Arrays.sort(members);

	  for(int i=0; i<members.length; i++) {

	   System.out.println("members[" + i + "].name=" + members[i].name);

	  }

	 }

}
