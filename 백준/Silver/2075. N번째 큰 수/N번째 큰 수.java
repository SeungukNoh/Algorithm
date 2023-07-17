import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N*N];
		int idx=0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0; j<N; j++) {				
				arr[idx++] = Integer.parseInt(st.nextToken());
			}
		}
		//System.out.println(Arrays.toString(arr));
		//[12, 7, 9, 15, 5, 13, 8, 11, 19, 6, 21, 10, 26, 31, 16, 48, 14, 28, 35, 25, 52, 20, 32, 41, 49]
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		// [5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 25, 26, 28, 31, 32, 35, 41, 48, 49, 52]
		System.out.println(arr[N*N-N]);
	}

}
