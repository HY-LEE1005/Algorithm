package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2440 {

	public static void main(String[] args) throws Exception {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String read = br.readLine();
		int n = Integer.parseInt(read);
			
			//2440
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			
			br.close();

	}
}
