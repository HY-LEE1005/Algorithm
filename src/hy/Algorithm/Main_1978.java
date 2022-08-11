import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1978 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		String[] arr = new String[N];
		int[] intArr = new int[N];
		
		String str = br.readLine();
		arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		for (int i = 0; i < intArr.length; i++) {
			if(is_prime(intArr[i]) == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean is_prime(int number) {
		
		boolean chexk = false;
		 
		// 0 과 1 은 소수가 아니다
		if(number < 2) {
			chexk = false;
			return chexk;
		}
		
		// 2 는 소수다
		if(number == 2) {
			chexk = true;
			return chexk;
		}
		
		for(int i = 2; i < number; i++) {
			// 소수가 아닐경우
			if(number % i == 0) {
				chexk = false;
				return chexk;
			}
		}
		
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		chexk = true;
		return chexk;
	}
	
}
