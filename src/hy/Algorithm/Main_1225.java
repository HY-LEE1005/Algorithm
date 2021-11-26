package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1225 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read = br.readLine();
		String[] num = read.split(" ");
		
		long sum = 0;

		for (int i = 0; i < num[0].length(); i++) {
			for (int j = 0; j < num[1].length(); j++) {
				sum += Integer.parseInt(num[0].charAt(i)+"") * Integer.parseInt(num[1].charAt(j)+"");
			}
		}
		
		System.out.print(sum);
		
		br.close();
	}

}
