package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2562 {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int count = 0;
		int index = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < arr.length; i++) {
			count++;
			if(max < arr[i]){
				max = arr[i];
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.print(index);
		
		br.close();
	}

}
