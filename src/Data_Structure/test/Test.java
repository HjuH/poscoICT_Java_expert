package Data_Structure.test;

public class Test {
	public static void main(String[] args) {
		int[] a = {34, 27, 19, 51, 8, 24, 11};
		int b;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) {
				if(a[j]>a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
	}
}
