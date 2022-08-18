import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//스택 활용 문제
public class Main_9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			
			String str = br.readLine();
			boolean chk = true;
			
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				
				// 여는 괄호일 경우 스택에 넣는다.
				if (c == '(') {
					stack.push(c);
				}
				// 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
				else if (stack.empty()) {
					chk = false;
				}
				// 닫는 괄호를 입력받아 여는 괄호와 짝이 맞는 경우 stack 원소를 pop 한다.
				else {
					stack.pop();
				}
			}
			
			if(stack.empty() && chk == true) {
				sb.append("YES");
			}
			else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
