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
    	
    	for (int i = 1; i < N+1; i++) {
			ans = ans + Math.abs(arr[i]-i);
		}
    	System.out.println(ans);
    }
}