package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1159 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int person = Integer.parseInt(br.readLine());
		int[] NameCheck = new int[26];
		char[] LastName = new char[person];

		for (int i = 0; i < person; i++) {
			String name = br.readLine();
			LastName[i] += name.charAt(0);
			NameCheck[LastName[i] - 97] ++;
		}
		
		boolean check = false;
		for (int i = 0; i < NameCheck.length; i++) {
			if (NameCheck[i] >= 5) {
				check = true;
				sb.append((char)(i + 97));
			}
		}
		
		if(check == false){
			System.out.print("PREDAJA");
		} else {
			System.out.print(sb.toString());
		}
		
		br.close();
	}
	
}
