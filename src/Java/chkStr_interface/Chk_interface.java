package chkStr_interface;

import java.util.Scanner;

interface Ti {
	public int cmp();
}

abstract class Tr {
	String s;
	String t;
	
	public Tr() {}
	
	public Tr(String s, String t) {
		this.s = s;
		this.t = t;
	}
}

class StrCmp extends Tr implements Ti {
	public StrCmp(String s, String t) {
		super(s, t);
	}
	
	public int cmp() {
		int result = s.compareTo(t);
		return result;
	}
}

class NumCmp extends Tr implements Ti {
	public NumCmp(String s, String t) {
		super(s, t);
	}
	
	public int cmp() {
		double a = Double.parseDouble(s);
		double b = Double.parseDouble(t);
		
		int result;
		if(a > b) result = 1;
		else if(a < b) result = -1;
		else result = 0;
		
		return result;
	}
}

class Select extends Tr {
	public Select(String s, String t) {
		super(s, t);
	}
	
	Tr check() {
		Tr tr;
		
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(0) == '-') continue;
			char c = s.charAt(i);
			if(!Character.isDigit(c) || c == '.') {
				tr = new StrCmp(s, t);
				return tr;
			}
		}
		for(int j=0 ; j<t.length() ; j++) {
			if(t.charAt(0) == '-') continue;
			char c = t.charAt(j);
			if(!Character.isDigit(c) || c == '.') {
				tr = new StrCmp(s, t);
				return tr;
			}
		}
		
		tr = new NumCmp(s, t);
		return tr;
	}
	
	
}

public class Chk_interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Tr P, Q;
		
		P = new Select(s, t);
		Q = ((Select)P).check();
		
		System.out.println(((Ti)Q).cmp());
	}
}

