import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] arrStr = new String[3];
		
		arrStr = str.split(" ");
		int A = Integer.parseInt(arrStr[0]); //up
		int B = Integer.parseInt(arrStr[1]); //down
		int V = Integer.parseInt(arrStr[2]); //length
		
		int day = (V - B) / (A - B);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우) 1일 추가
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.println(day);

	}
}
