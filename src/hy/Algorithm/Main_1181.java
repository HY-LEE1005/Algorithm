

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Main_1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		//배열 문자 사전순 정렬
		Arrays.sort(arr);
		
		//배열 문자 길이순 정렬
		Arrays.sort(arr, Comparator.comparing(String::length));
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(arr) );
		String[] strArrayWithoutDuplicates = linkedHashSet.toArray(new String[] {});
		
		for (int i = 0; i < strArrayWithoutDuplicates.length; i++) {
			System.out.println(strArrayWithoutDuplicates[i]);
		}
		
		br.close();
	}

}
