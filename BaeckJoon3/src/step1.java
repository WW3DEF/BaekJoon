import java.util.*;

public class step1 {
    /*
     for문 가이드
     for( 초기문; 조건문; 증감 ) {
    	조건동안 반복될 문장
     }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i=1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
        sc.close();
    }
}