import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arrNum = br.readLine().split(" ");

        int x = Integer.parseInt(arrNum[0]);
        int y = Integer.parseInt(arrNum[1]);
        int w = Integer.parseInt(arrNum[2]) - x;
        int h = Integer.parseInt(arrNum[3]) - y;

        int minNumXY = Math.min(x , y);
        int minNumWH = Math.min(w , h);
        int minNum = Math.min(minNumXY , minNumWH);

        sb.append(minNum);

        System.out.print(sb.toString());
        br.close();
    }
}
