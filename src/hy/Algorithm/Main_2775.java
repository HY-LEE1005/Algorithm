import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2775 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;	// i층 1호
            APT[0][i] = i;	// 0층 i호
        }

        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];  //i 층의 직전 호(j-1) 와 j 호의 아래층(i-1) 의 합
            }
        }

        // k 과 n 를 입력받을 때마다 APT[n][k] 를 출력
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}
