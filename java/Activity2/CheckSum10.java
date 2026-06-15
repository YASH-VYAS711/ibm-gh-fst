package Activity2;

public class CheckSum10 {
	public static void main(String[] args) {
		int[] arr= {10,77,10,54,10,-11,10};
		int count = 0;
		for (int i : arr) {
			if (i==10) {
				count++;
			}
		}
		if (count!=3) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
		
	}
}
