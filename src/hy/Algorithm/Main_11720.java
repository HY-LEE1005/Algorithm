import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String strNum = br.readLine();
        int sum = 0;

        //문자열
        /*for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(strNum.substring(i, i+1));
        }*/

        //유니코드
        for (int i = 0; i < count; i++) {
            sum += strNum.charAt(i) - '0';
        }

        System.out.print(sum);
        br.close();
    }
}
