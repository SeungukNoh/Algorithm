import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(); // 낮은 숫자가 우선순위 높은게 기본 기준
        
        for (int i = 0; i < N; i++) {
           int x = Integer.parseInt(br.readLine());
           
            if (x>0) { // x가 자연수면 배열에 추가하는 연산
                minQueue.offer(x);
            } else { // x가 0인데 배열이 비어있으면 0 출력
                if (minQueue.isEmpty()) {
                	System.out.println(0);                    
                }
                else{ // x가 0이면 배열 값 중에 최솟값 출력
                	System.out.println(minQueue.poll());
                }
            }
        }
        
	}
}
