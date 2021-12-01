package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2163 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String time = br.readLine();
		String[] arr = time.split(" ");
		
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		System.out.print(N * M - 1);
		
		br.close();

	}

}
