import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int S = Integer.parseInt(st.nextToken());
    	int R = Integer.parseInt(st.nextToken());
    	boolean[] arr = new boolean[N];
    	
    	st = new StringTokenizer(bf.readLine());
    	for (int i = 0; i < S; i++) {
    		int s = Integer.parseInt(st.nextToken());
    		arr[s-1]=true;
		}	// 손상된 팀은 true로 표현
    	
    	st = new StringTokenizer(bf.readLine());
    	boolean[] rent = new boolean[N]; // 빌려줄 수 있는지 상태 관리 
    	
    	for (int i = 0; i < R; i++) {
    		int r = Integer.parseInt(st.nextToken());
    		rent[r-1]=true;
		}	// 여분을 가져온 팀은 true
    		
    	int ans = 0; // 출발 할 수 없는 팀 수
    	
    	// 자기꺼 먼저 다 수리하기
    	for(int i=0; i<N; i++) {
    		if(arr[i]&&rent[i]) {
    			arr[i]=false;
    			rent[i]=false;
    		}
    	}
    	
    	// 첫번째 팀이 손상된 경우
    	if(arr[0]) {
			if(rent[1]) rent[1]=false;
			else ans++;
		}
    	
    	// 중간 팀이 손상된 경우
    	for(int i=1; i<N-1; i++) {
    		if(arr[i]) {
    			if(rent[i-1]) continue;
    			else if(rent[i+1]) rent[i+1]=false;
    			else ans++;
    		}
    	}
    	
    	// 마지막 팀이 손상된 경우
    	
    	if(arr[N-1]) {
    		if(rent[N-2]) rent[N-2]=false;
    		else ans++;
    	}
    	
    	System.out.println(ans);
    }
}