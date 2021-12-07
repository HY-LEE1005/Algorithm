package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1330 {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] arr = num.split(" ");
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		br.close();
	}

}
