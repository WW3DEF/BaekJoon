import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class step6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		A+= C/60;		// A의 값을 C를 60으로 나눈 몫을 합산
		B+= C%60;		// B의 값을 C를 60으로 나눈 나머지를 합산
		
		if(B>=60) {
			A+=1;	// 60분을 넘기면 A에 1시를 더하고
			B-=60;	// B에 60분을 빼준다
		}
		if(A>=24) {
			A-=24;		// 24시가 넘으면 0이 되게끔 A값에서 24를 빼줌
		}
		System.out.println(A + " " + B);
	}
}
