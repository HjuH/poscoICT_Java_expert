package binaryCheck;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = sc.nextInt();
		int check = 0X80000000;
		System.out.println("2진수 : " + Integer.toBinaryString(number));
		
		for(int i=0 ; i<n ; i++) {
			if((number & check) == 0) {
				number = number << 1;
			} else {
				number = number << 1;
				number = number + 1;
			}
		}
		
		System.out.println("n-bit circular shift : " + Integer.toBinaryString(number));
	}
}
