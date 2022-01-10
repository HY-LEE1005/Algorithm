import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10950 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String strNum = br.readLine();
            String[] arrNum = strNum.split(" ");

            sb.append((Integer.parseInt(arrNum[0]) + Integer.parseInt(arrNum[1])) + "\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}
