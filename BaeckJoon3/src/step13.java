import java.util.Scanner;

public class step13 {
	/*
	 EOF 쓰기
	 EOF란 End Of File의 약자로, 데이터 소스로부터 더 이상 읽을수 있는 데이터가 없음을 나타내는 용어다.
	 입력값을 얼마나 받을지 명시하지 않을 경우 EOF를 사용한다.
	 Scanner에서는 hasNext()라는 메소드를 이용하여 할 수 있다.
	 입력된 토큰이 있으면 True를 반환하고, 그렇지 않을 시 False를 반환한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext() == true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}

}
