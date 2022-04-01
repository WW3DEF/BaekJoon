import java.util.Scanner;

public class step7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int max = A;
		
		if(A == B && B == C) {
			System.out.println(10000+(1000*A));
		} else if(A != B && B != C && A != C) {
			if(max < B) {
				max = B;
			}
			if(max < C) {
				max = C;
			}
			System.out.println(100 * max);
		} else {
			if (A != B) {
				System.out.println(1000 + (100 * C));
			}
			if (A != C) {
				System.out.println(1000 + (100 * B));
			}
		}
	}
}
