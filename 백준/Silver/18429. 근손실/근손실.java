import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// N일동안 하루 K만큼 근손실
	static int N;
	static int K;
	static int[] kit;
	static boolean[] visited;
	static int ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		ans=0;
		
		st = new StringTokenizer(bf.readLine());
		kit = new int[N];
		for (int i = 0; i < N; i++) {
			kit[i] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[N];
		
		weight(500, 0);
		System.out.println(ans);
	}
	
	static void weight(int w, int day) {
		if(day == N) { // 해당 루틴 합격
			ans++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(visited[i]) continue; //써먹은 운동 키트면 패스
			visited[i] = true; // 방문배열 업데이트
			
			if(w-K+kit[i]>=500) { // 근손실이 나지 않으면 현재 중량으로 다음날 호출
				weight(w-K+kit[i], day+1);
			}	
			visited[i] = false;
		}
		
	}

}
