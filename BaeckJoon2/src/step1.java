import java.util.Scanner;

public class step1 {
		/*
		 if(조건문) {
		 	조건 만족시 실행문
		 	} else {
		 	불만족시 실행문
		 	}
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}	else if(b > a) {
			System.out.println("<");
		}	else if(a == b) {
			System.out.println("==");
		}
		
	}
	}



