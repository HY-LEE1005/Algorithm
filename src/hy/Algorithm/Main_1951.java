import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1951 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean check = true;
        String strNum = "";

        while (check == true){
            if ((strNum = br.readLine()) != null) {
                String[] arrNum = strNum.split(" ");

                sb.append((Integer.parseInt(arrNum[0]) + Integer.parseInt(arrNum[1])) + "\n");
            } else {
                check = false;
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}
