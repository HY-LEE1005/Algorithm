package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2525 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String time = br.readLine();
		String[] arr = time.split(" ");
		
		int hh = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		int cookingTime = Integer.parseInt(br.readLine());;
		
		int afterTime = (hh * 60) + mm + cookingTime;
		
		sb.append((afterTime / 60) % 24 + " " + (afterTime % 60));
		
		System.out.print(sb.toString());
		
		br.close();

	}

}
