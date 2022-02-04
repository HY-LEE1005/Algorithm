import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15829 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = 1234567891;
        int r = 31;

        int Long = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long ChaStr = 0;
        long pow = 1;

        for (int i = 0; i < Long; i++) {
            ChaStr += (str.charAt(i) - 'a' + 1) * pow;
            pow = (pow *= r) % M;
        }

        System.out.println(ChaStr % M);

        br.close();
    }
}
