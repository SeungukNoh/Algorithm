import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
  
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(bf.readLine());
    	int[] arr = new int[N+1];
    	for(int i=1; i<N+1; i++) {
    		arr[i]=Integer.parseInt(bf.readLine());
    	}
    	
    	long ans = 0;
    	Arrays.sort(arr); // 오름차순 정렬, 역순으로 체크해보자

    	for (int i = N; i > 0; i--) {
    		
    		// 맨 뒤의 값(arr[N+1]이 가장 먼저 입장(1번), 인덱스는 뒤에서부터 하나씩 오고, 해당 인덱스의 입장 순서(N+1)-i
    		if(arr[i]-(N+1-i-1)>0) { //음수가 아닌 경우에만 합				
				ans= ans + arr[i]-(N+1-i-1);
			}
			
		}
    	System.out.println(ans);
    }
}