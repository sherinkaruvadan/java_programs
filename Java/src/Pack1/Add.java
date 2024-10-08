package Pack1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of numbers");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i] = sc.nextInt();			
		}
		
		int sum =0;
		for(int i=0;i<length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of numbers : "+sum);

	}

}
