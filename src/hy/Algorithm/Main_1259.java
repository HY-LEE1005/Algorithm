import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1259 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String n = br.readLine();

            if(n.equals("0")){
                break;
            } else {
                String[] arr = new String[n.length()];
                String[] arr2 = new String[n.length()];

                //arr에 한글자씩 넣고, 뒤집어서 arr2에 넣고
                for (int i = 0; i < n.length(); i++) {
                    arr[i] = n.substring(i, i+1);
                }
                for (int i = 0; i < n.length(); i++) {
                    arr2[i] = arr[n.length()-1-i];
                }

                int count = 0;
                //문자가 같으면 count +
                for (int i = 0; i < n.length(); i++) {
                    if (arr[i].equals(arr2[i])) {
                        count++;
                    }
                }

                //count와 글자수가 같으면 같은 문자
                if(count == n.length()){
                    sb.append("yes").append('\n');
                }else{
                    sb.append("no").append('\n');
                }
            }
        }
        System.out.println(sb);

        br.close();
    }
}
