package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10250 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int Count = Integer.parseInt(br.readLine());
		String[] TestArr = new String[3];
		
		for (int i = 0; i < Count; i++) {
			String read = br.readLine();
			TestArr = read.split(" ");
			
			if(Integer.parseInt(TestArr[2]) % Integer.parseInt(TestArr[0]) == 0){
				sb.append(Integer.parseInt(TestArr[0]) * 100 + (Integer.parseInt(TestArr[2]) / Integer.parseInt(TestArr[0]))).append("\n");
			} else {
				sb.append((Integer.parseInt(TestArr[2]) % Integer.parseInt(TestArr[0])) * 100 + (Integer.parseInt(TestArr[2]) / Integer.parseInt(TestArr[0])) + 1).append("\n");
			}
			
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
