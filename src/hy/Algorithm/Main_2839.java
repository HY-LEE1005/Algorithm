import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2839 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //n 이 4 또는 7 인 경우
        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        //n 이 5의 배수인경우 ( 5로 나눈 나머지가 0 인 경우 )
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        //n 이 5의 배수 + 1 또는 5의 배수 + 3 인 경우 ( 5로 나눈 나머지가 1 또는 3 인 경우 )
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        //n 이 5의 배수 + 2 또는 5의 배수 + 4 인 경우 ( 5로 나눈 나머지가 2 또는 4 인 경우 )
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }

        br.close();
    }
}
