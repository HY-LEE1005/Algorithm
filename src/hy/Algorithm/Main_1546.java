import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1546 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String[] arrNum = (br.readLine()).split(" ");

        float[] changNum = new float[count];
        float Average = 0;
        float maxNum = 0;

        for (int i = 0; i < count; i++) {
            maxNum = Math.max(Integer.parseInt(arrNum[i]) , maxNum);
        }

        for (int i = 0; i < count; i++) {
            float num = Integer.parseInt(arrNum[i]);
            changNum[i] = num/maxNum*100;
            Average += changNum[i];
        }

        sb.append(Average/count);

        System.out.print(sb.toString());
        br.close();
    }
}
