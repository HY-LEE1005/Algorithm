package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1008 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] arr = num.split(" ");
		
		double A = Double.parseDouble(arr[0]);
		double B = Double.parseDouble(arr[1]);
		
		System.out.println(A / B);
		
		br.close();
	}

}
