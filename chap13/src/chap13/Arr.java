package chap13;

import java.util.Arrays;

public class Arr {
public static void main(String[] args) {
	

	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = new int[] { 1, 2, 3 };
	int[] arr3 = new int[3];
	arr3[0] = 1;
	arr3[1] = 2;
	arr3[2] = 3;
	
	for (int i = 0; i < arr1.length; i++) 
		{System.out.println(arr3[i]);}
	for (int num : arr2) System.out.println(num);
	System.out.println(Arrays.toString(arr3)); 
	
}}
