import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1952 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean check = true;

        while (check == true){
            String strNum = br.readLine();
            String[] arrNum = strNum.split(" ");

            if (Integer.parseInt(arrNum[0]) != 0 && Integer.parseInt(arrNum[1]) != 0) {
                sb.append((Integer.parseInt(arrNum[0]) + Integer.parseInt(arrNum[1])) + "\n");
            } else {
                check = false;
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}
