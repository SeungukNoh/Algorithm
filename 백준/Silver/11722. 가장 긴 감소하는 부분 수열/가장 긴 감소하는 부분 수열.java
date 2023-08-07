import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[] arr = new int[n+1];
		int[] cnt = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		for (int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
			
		int ans = 0;
		
		for (int i=1; i<=n; i++) {
			cnt[i] = 1;
			for (int j=1; j<i; j++) {
				if (arr[j] > arr[i]) {
					cnt[i] = Math.max(cnt[i], cnt[j] + 1);
				}
			}
			ans = Math.max(ans, cnt[i]);
		}
		
		System.out.println(ans);
		
	}
    
}