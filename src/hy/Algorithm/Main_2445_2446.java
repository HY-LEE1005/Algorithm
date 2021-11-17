package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2445_2446 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String read = br.readLine();
		int n = Integer.parseInt(read);
		
		//2445
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				sb.append("*");
			}
			for (int j = 1; j < (n-i)*2-1; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n-i; j++) {
				sb.append("*");
			}
			for (int j = 0; j < i*2; j++) {
				sb.append(" ");
			}
			for (int j = 1; j <= n-i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
		//2446
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i+1; j++) {
				sb.append(" ");
			}
			for (int j = 1; j < (n-i)*2; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 1; i < n; i++) {
			for (int j = 2; j <= n-i; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
		br.close();

	}
}
