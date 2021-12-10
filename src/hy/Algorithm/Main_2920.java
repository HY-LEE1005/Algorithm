package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2920 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		if(str.equals("1 2 3 4 5 6 7 8")){
			sb.append("ascending");
		}else if(str.equals("8 7 6 5 4 3 2 1")){
			sb.append("descending");
		}else{
			sb.append("mixed");
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
