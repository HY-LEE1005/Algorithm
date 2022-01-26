import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2231 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String number = br.readLine();

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

        System.out.print(sb.toString());
        br.close();
    }
}
