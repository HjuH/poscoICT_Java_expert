package chkStr_inherit;

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

class Select extends Tr {
	public Select() {}
	
	public Select(String s, String t) {
		super(s, t);
	}
	
	class Numcmp {
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
	
	class Strcmp {
		int cmp() {
			int result = s.compareTo(t);
			return result;
		}
	}
	
	int check() {	
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(0) == '-') continue;
			char c = s.charAt(i);
			if(!Character.isDigit(c) || c == '.') {
				return new Strcmp().cmp();
			}
		}
		for(int j=0 ; j<t.length() ; j++) {
			if(t.charAt(0) == '-') continue;
			char c = t.charAt(j);
			if(!Character.isDigit(c) || c == '.') {
				return new Strcmp().cmp();
			}
		}
		
		return new Numcmp().cmp() ;
	}
}

public class Chkstr_ihr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Tr P = new Select(s, t);
		
		System.out.println(((Select)P).check());
	}
}
