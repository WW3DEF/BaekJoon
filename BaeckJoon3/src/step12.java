import java.util.Scanner;

public class step12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(;A != 0 && B != 0;) {
			System.out.println(A+B);
			A = sc.nextInt();
			B = sc.nextInt();
		}
		sc.close();
	}

}
