package Data_Structure.abstractPractice;

import java.util.Scanner;

abstract class Calculator {
	public Calculator() {}
	
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double avg(int[] a);
}

class Calc extends Calculator {
	public Calc() {
		super();
	}
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	
	@Override
	public double avg(int[] a) {
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int num1 = 2; int num2 = 3;
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("덧셈 결과 : " + calc.add(num1, num2));
		System.out.println("밸셈 결과 : " + calc.sub(num1, num2));
		System.out.println("평균 : " + calc.avg(arr));
	}
}
