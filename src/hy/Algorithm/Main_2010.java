package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2010 {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Count = Integer.parseInt(br.readLine());
		int[] CountArr = new int[Count];
		int sum = 0;
		
		for (int i = 0; i < Count; i++) {
			CountArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < CountArr.length; i++) {
			sum = sum + CountArr[i];
		}
		
		System.out.println(sum - (Count - 1));
		
		br.close();
	}

}
