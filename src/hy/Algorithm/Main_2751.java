import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//배열 정렬
		Arrays.sort(arr);
		
		for (int j = 0; j < arr.length; j++) {
			sb.append(arr[j]);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
