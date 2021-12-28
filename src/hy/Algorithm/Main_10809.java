import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10809 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.print(sb.toString());

        br.close();
    }
}
