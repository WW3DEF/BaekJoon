import java.util.Scanner;

public class step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}

}
