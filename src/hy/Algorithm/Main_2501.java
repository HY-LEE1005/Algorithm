package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2501 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read = br.readLine();
		String[] arr = read.split(" ");
		
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		int j = 0;
		int arr1[] = new int[N];
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0){
				arr1[j] = i;
				j++;
			}
		}
		if(arr1[K-1] != 0) {
			System.out.print(arr1[K-1]);
		}else{
			System.out.print(0);
		}
		
		br.close();

	}

}
