import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1152 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine().trim();

        if(str != ""){
            String[] arr = str.split(" ");
            System.out.print(arr.length);
        } else {
            System.out.print(0);
        }
    }
}
