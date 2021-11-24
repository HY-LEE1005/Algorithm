package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2292 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String read = br.readLine();
		int n = Integer.parseInt(read);
		
		if (n <= 7) {
			if(n == 1){
				sb.append(1);
			}else{
				sb.append(2);
			}
		} else {
			int floor = 3;
			int count = 0;
			int num = 0;
			
			while(true) {
				num = 6 * (count + floor) + 1;
				
				if(num >= n){
					sb.append(floor);
					break;
				}
				count = count + floor - 1;
				floor++;
			}
			
		}
		
		System.out.print(sb.toString());
		
		br.close();

	}

}
