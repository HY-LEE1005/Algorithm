import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2231 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*String number = br.readLine();

        for (int i = 0; i <= Integer.parseInt(number); i++) {

            int sum = 0;
            char[] num = String.valueOf(i).toCharArray();

            for (int j = 0; j < num.length; j++) {
                sum += num[j] - '0';
            }

            sum += i;

            if(sum == Integer.parseInt(number)){
                sb.append(i);
                break;
            }else if(i == Integer.parseInt(number)){
                sb.append("0");
                break;
            }
        }

        System.out.print(sb.toString());*/

        int N = Integer.parseInt(br.readLine());

        for (int i = 0, sum = 0, temp = 0; i < N; i++, sum = 0, temp = 0) {
            temp = i;

            //temp가 0이 될때까지 반복 => 각 자리 수의 합 구하기
            // % 나머지 연산으로 마지막 자리를 구해서 더하고
            // / 나누기 연산으로 마지막 자리 제외한 앞자리를 temp에 저장 (한자리 수는 10으로 나누면 몫이 0이여서 while문 나오게됨)
            while(temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            sum += i;

            //각 자리 수 + 숫자 = N 이면 출력
            if(sum == N) {
                System.out.println(i);
                return;
            }
        }
        //위에서 출력 못하면 0
        System.out.println("0");

        br.close();
    }
}
