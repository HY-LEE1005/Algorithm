package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2675 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			String[] arr = br.readLine().split(" ");
			
			int num = Integer.parseInt(arr[0]);
			String message = arr[1];
			
			for (int j = 0; j < message.length(); j++) {
				for (int k = 0; k < num; k++) {
					sb.append(message.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());	
	}
}
