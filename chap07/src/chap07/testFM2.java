package chap07;

import java.util.Scanner;

public class testFM2 extends testFM {

	void Answer() {
	Scanner superscan = new Scanner(System.in);
	String q = superscan.nextLine();
	
	if (q.equals( "러브다이브" )) {
		System.out.println("누구냐");
		
			Scanner superscan2 = new Scanner(System.in);
			String w = superscan2.nextLine();
			
			if  (w.equals( "김명현" )) {
				System.out.println("신원 확인을 위해 3보 이동");
			}
		
			 else {
				System.out.println("용무는?");
			}
			superscan2.close();
			
	}else {
		System.out.println("탕");
	}
	superscan.close();
	}
}
