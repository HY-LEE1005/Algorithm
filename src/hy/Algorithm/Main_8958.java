import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8958 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String arr[] = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int count = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }

                sum += count;
            }

            sb.append(sum + "\n");
        }
        System.out.print(sb.toString());

        br.close();
    }
}
