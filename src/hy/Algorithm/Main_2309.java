package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2309 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] nine = new int[9];
		
		int sum=0;
		for (int i = 0; i < nine.length; i++) {
			nine[i] = Integer.parseInt(br.readLine());
			sum += nine[i];
		}
		
		Arrays.sort(nine);
		
		int a = 0;
		int a_count = 0;
		int b = 0;
		int b_count = 0;

		loop:
		for (int i = 0; i < nine.length; i++) {
			a = nine[i];
			for (int j = 1; j < nine.length; j++) {
				b = nine[j];
				if(sum - (a + b) == 100){
					a_count = i;
					b_count = j;
					
					break loop;
				}
			}
		}

		for (int i = 0; i <nine.length; i++) {
			
			if(i == a_count || i == b_count) continue;
			
			sb.append(nine[i]);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
