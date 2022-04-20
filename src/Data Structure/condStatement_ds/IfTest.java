package condStatement_ds;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에 입력하세요.");
		System.out.print("철수 : ");
		String c = sc.next();
		System.out.print("영희 : ");
		String y = sc.next();
		
		if(c.equals("보")&&y.equals("바위") || c.equals("바위")&&y.equals("가위") || c.equals("가위")&&y.equals("보")) {
			System.out.println("철수가 이겼습니다.");
		} else if(y.equals("보")&&c.equals("바위") || y.equals("바위")&&c.equals("가위") || y.equals("가위")&&c.equals("보") ) {
			System.out.println("영희가 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}
