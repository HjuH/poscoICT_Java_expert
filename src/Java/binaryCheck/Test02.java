package binaryCheck;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = sc.nextInt();
		int check = 0X80000000;
		System.out.println("2진수 : " + Integer.toBinaryString(number));
		
		for(int i=0 ; i<n ; i++) {
			if(number >= 0) {
				if((number & 1) == 0) {
					number = number >> 1;
				} else {
					number = number >> 1;
					number = number | check;
				}
			} else {
				if((number & 1) == 1) {
					number = number >> 1;
				} else {
					number = number >> 1;
					number = number & (~check);
				}
			}
		}
		
		System.out.println("n-bit circular shift : " + Integer.toBinaryString(number));
	}
}
