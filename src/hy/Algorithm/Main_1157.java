import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1157 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = 0;
        char cha = '?';
        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { //대문자
                arr[str.charAt(i) - 'A']++;
            }
            else {	// 소문자
                arr[str.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cha = (char) (i + 'A');
            }
            else if (arr[i] == max) {
                cha = '?';
            }
        }
        sb.append(cha);

        System.out.print(sb.toString());
        br.close();
    }
}
