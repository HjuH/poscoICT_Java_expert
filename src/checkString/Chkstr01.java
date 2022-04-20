package checkString;

import java.util.Scanner;

public class Chkstr01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		double a, b; int result;
		
		Ts P = new Ts(s, t);
		int cond = P.check();
		
		if(cond == Ts.STR) {
			result = s.compareTo(t);
		} else {
			a = Double.parseDouble(s);
			b = Double.parseDouble(t);
			
			if(a > b) result = 1;
			else if(a < b) result = -1;
			else result = 0;
		}
		
		System.out.println(result);
	}
}

class Ts {
	final static int NUM = 1;
	final static int STR = 0;
	private String s;
	private String t;
	
	public Ts(String s, String t) {
		this.s = s;
		this.t = t;
	}
	
	public int check() {
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(0) == '-') continue;
			char c = s.charAt(i);
			if(!Character.isDigit(c) || c == '.') return STR;
		}
		for(int j=0 ; j<t.length() ; j++) {
			if(t.charAt(0) == '-') continue;
			char c = t.charAt(j);
			if(!Character.isDigit(c) || c == '.') return STR;
		}
		
		return NUM;
	}
}
