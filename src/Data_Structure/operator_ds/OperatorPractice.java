package Data_Structure.operator_ds;

import java.util.Scanner;

public class OperatorPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		System.out.println("5만원권 : " + money/50000);
		System.out.println("만원권 : " + (money%50000)/10000);
		System.out.println("5천원 : " + (money%50000)%10000 / 5000);
		System.out.println("천원 : " + (money%50000)%10000%5000 / 1000);
		System.out.println("5백원 : " + (money%50000)%10000%5000%1000 / 500);
		System.out.println("백원 : " + (money%50000)%10000%5000%1000%500 / 100);
		System.out.println("백원 : " + (money%50000)%10000%5000%1000%500%100 / 50);
	}
}
