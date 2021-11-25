package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1712 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String read = br.readLine();
		String[] arr = read.split(" ");
		
		int fixed = Integer.parseInt(arr[0]);
		int variable = Integer.parseInt(arr[1]);
		int sale = Integer.parseInt(arr[2]);
		
		if(sale <= variable){
			sb.append(-1);
		} else {
			sb.append((fixed / (sale - variable) + 1));
		}
		
		System.out.print(sb.toString());
		
		br.close();

	}

}