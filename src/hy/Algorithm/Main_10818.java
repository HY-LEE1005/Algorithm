import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        int[] numArr = new int[count];
        int maxNum = 0;
        int minNum = 0;

        String num = br.readLine();
        String[] arr = num.split(" ");

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        minNum = numArr[0];
        maxNum = numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] > maxNum){
                maxNum = numArr[i];
            } else if (numArr[i] < minNum) {
                minNum = numArr[i];
            }
            
            //최소, 최대 비교해주는 메소드
            maxNum = Math.max(numArr[i] , maxNum);
            minNum = Math.min(numArr[i] , minNum);
        }
        sb.append(minNum + " " + maxNum);

        System.out.print(sb.toString());
        br.close();
    }
}
