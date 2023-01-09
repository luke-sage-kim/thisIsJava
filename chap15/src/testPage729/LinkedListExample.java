package testPage729;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	 public static void main(String[] args) {
	        //ArrayList 생성
	        List<String> list1 = new ArrayList<String>();

	        //LinkedList 생성
	        List<String> list2 = new LinkedList<String>();

	        long startTime;
	        long endTime;

	// 순차적으로 값을 추가하는 경우
	        startTime = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	        	list1.add(0, String.valueOf(i));
	        }
	        endTime = System.nanoTime();
	        System.out.println("순차적으로 추가할 때 ArrayList 걸린 시간 :" + (endTime - startTime) + "ns");
	        
	        
	        
	        startTime = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            list2.add(0, String.valueOf(i));
	        }
	        
	        endTime = System.nanoTime();
	        System.out.println("순차적으로 추가할 때 LinkedList 걸린 시간 :" + (endTime - startTime) + "ns");
	     
	      
	 }

}
