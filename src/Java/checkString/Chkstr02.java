package checkString;

import java.util.Scanner;

class Tr {
	String s;
	String t;
	
	public Tr() {}
	
	public Tr(String s, String t) {
		this.s = s;
		this.t = t;
	}
}

class Strcmp extends Tr {
	public Strcmp(String s, String t) {
		super(s, t);
	}
	
	int cmp() {
		int result = s.compareTo(t);
		return result;
	}
}

class Numcmp extends Tr {
	public Numcmp(String s, String t) {
		super(s, t);
	}
	
	int cmp() {
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
		Tr r;
		
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(0) == '-') continue;
			char c = s.charAt(i);
			if(!Character.isDigit(c) || c == '.') {
				r = new Strcmp(s, t);
				return r;
			}
		}
		for(int j=0 ; j<t.length() ; j++) {
			if(t.charAt(0) == '-') continue;
			char c = t.charAt(j);
			if(!Character.isDigit(c) || c == '.') {
				r = new Strcmp(s, t);
				return r;
			}
		}
		
		r = new Numcmp(s, t);
		return r;
	}
	
	int connect(Tr tr) {
		if(tr instanceof Numcmp) {
			return ((Numcmp) tr).cmp();
		} 
		return ((Strcmp) tr).cmp();
	}
}

public class Chkstr02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Tr P, Q;
		
		P = new Select(s, t);
		Q = ((Select)P).check();
		
		System.out.println(((Select)P).connect(Q));
	}
}
