import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_4153 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String num = br.readLine();

            if(!num.equals("0 0 0")){
                String[] arr = num.split(" ");
                double[] numarr = new double[3];

                for (int i = 0; i < arr.length; i++) {
                    numarr[i] = Double.parseDouble(arr[i]);
                }

                Arrays.sort(numarr);

                if(Math.pow(numarr[2], 2) == Math.pow(numarr[1], 2) + Math.pow(numarr[0], 2)) {
                    sb.append("right" + "\n");
                } else {
                    sb.append("wrong" + "\n");
                }
            } else {
                break;
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}
