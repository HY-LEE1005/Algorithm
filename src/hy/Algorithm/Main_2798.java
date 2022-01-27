import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 카드의 수
        int Count = Integer.parseInt(st.nextToken());
        // 만들어야 하는 수
        int Number = Integer.parseInt(st.nextToken());

        // 카드 수 배열에 담기
        int[] arr = new int[Count];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < Count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, Count, Number);
        System.out.println(result);
    }

    // 탐색
    static int search(int[] arr, int Count, int Number) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 Number - 2 까지만 순회
        for (int i = 0; i < Count - 2; i++) {

            // 두 번째 카드는 첫 번째 카드 다음부터 Number - 1 까지만 순회
            for (int j = i + 1; j < Count - 1; j++) {

                // 세 번째 카드는 두 번째 카드 다음부터 Number 까지 순회
                for (int k = j + 1; k < Count; k++) {

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // Number과 세 카드의 합이 같다면 temp return 및 종료
                    if (Number == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 Number 보다 작을 경우 result 갱신
                    if(result < temp && temp < Number) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
