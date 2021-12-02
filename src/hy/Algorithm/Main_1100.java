package hy.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1100 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] chess = new char[8][8];
		int Count = 0;

		String now = "";
		for (int i = 0; i < 8; i++) {
			now = br.readLine();

			for (int j = 0; j < 8; j++) {
				chess[i][j] = now.charAt(j);

				if ((i + j) % 2 == 0 && chess[i][j] == 'F') {
					Count++;
				}
			}
		}

		System.out.println(Count);
		
		br.close();
	}

}
