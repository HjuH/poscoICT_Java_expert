package Java.stringReverse;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		System.out.println("문자열\n문자");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
		
		String result = revsqueeze(s, c);
		System.out.println(result);
	}
	
	public static String revsqueeze(String s, char c) {
		String result = "";
		for(char ch : s.toCharArray()) {
			if(ch != c) {
				result = result + ch;
			}
		}
		
		String temp = "";
		for(int i=result.length()-1 ; i>=0 ; i--) {
			temp = temp + result.charAt(i);
		}
		
		
		return temp;
	}
}
