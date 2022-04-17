import java.util.Scanner;

public class step14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int N = sc.nextInt();
		int A,B,SUM,C = 0;
		A = N/10;
		B = N%10;
		SUM = A+B;
		i++;
		C = (SUM%10) + (B*10);
		while(N >= 0 && N <= 99) {
			A = C/10;
			B = C%10;
			SUM = A+B;
			if(C == N) {
				System.out.println(i);
				break;
			} else {
				i++;
				C = (SUM%10)+(B*10);
				continue;
			}
		}
	}

}
