import java.util.Arrays;
import java.util.Scanner;

public class step1 {
	/*
	 1차원 배열 사용하기 int[] A = new int[];
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);	// 배열 정렬 메소드 - 배열에 저장된 원소값들을 오름차순으로 정렬
		System.out.println(arr[0]+ " " + arr[N-1]);	// arr 배열의 첫번째 요소는 최소값이기에 최소값 출력, 마지막 원소값이 가장 큰 최대값이기에 최대값 출력
	}

}
