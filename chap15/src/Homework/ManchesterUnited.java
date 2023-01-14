package Homework;

import java.util.ArrayList;
import java.util.List;

public class ManchesterUnited {
	public static void main(String[] args) {
		
	
	List<String> list = new ArrayList<String>();
	list.add("David De Gea");
	list.add("Victor Lindelöf");
	list.add("Phil Jones");
	list.add("Harry Maguire");
	list.add("Lisandro Martínez");
	list.add("Bruno Fernandes");
	list.add("Cristiano Ronaldo");
	list.add("Anthony Martial");
	list.add("Marcus Rashford");
	list.add("Tyrell Malacia");
	System.out.println("현재 선수 명단");
	for(String str : list) {
		System.out.println("선수이름 : " + str);
	}
	
	System.out.println();
	list.remove(6);
	System.out.println("현재 선수 명단");
	for(String str : list) {
		System.out.println("선수이름 : " + str);
	}
}
}