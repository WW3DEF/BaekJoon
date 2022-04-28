import java.util.Arrays;
import java.util.Scanner;

public class step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int getIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				getIndex = i;
			}
		}
		System.out.println(max);
		System.out.println(++getIndex);
	}

}
