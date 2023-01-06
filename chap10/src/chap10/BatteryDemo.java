package chap10;

import java.util.Scanner;

public class BatteryDemo  {
	public static void main(String[] args) {
		Battery battery = new Battery();
		Scanner scanner = new Scanner(
	System.in
	);
		int use = scanner.nextInt();
		try {
		battery.usedBattery(use);
		}catch (NormalException e) {
			String message = e.getMessage();
			System.out.println(message);
				}
		}
	} 