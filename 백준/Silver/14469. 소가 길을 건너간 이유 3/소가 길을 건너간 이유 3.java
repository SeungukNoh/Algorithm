import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 
		 int N = Integer.parseInt(bf.readLine());
		 int[][] arr = new int[N][2];
		 
	     for (int i = 0; i < N; i++) {
	    	StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); //도착시간
			arr[i][1] = Integer.parseInt(st.nextToken()); // 검문 소요시간
		}
	    
		 Arrays.sort(arr, (o1, o2) -> {
			    return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순
		 });
		 
		 int time = 0; // 정답에 쓰일 변수
	    	
	    time = time + arr[0][0];
	    
	    for(int i=0; i<N; i++) {
	    	time = time + arr[i][1]; // 검문소요시간 합
	    	
	    	if(i<N-1 && arr[i+1][0]>time) { // 다음 소가 도착 안했을 경우에 생기는 비는 시간, 맨 마지막 도착 소는 제외
	    		time = time + (arr[i+1][0]-time);
	    	}
	    }
	    
	    System.out.println(time);
	}
}
