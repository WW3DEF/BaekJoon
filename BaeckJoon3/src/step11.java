import java.util.Scanner;

public class step11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i = 1; i <= A; i++) {
			int N = sc.nextInt();
			if(N < X)
				System.out.print(N + " ");
			}
		}
		
	}

