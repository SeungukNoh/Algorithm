import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken()); 
		int[] arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		
		for(int i =0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			arr[i]=Math.abs(arr[i]-S);
		}
		
		int D = arr[0];
		
		for (int i = 0; i < N; i++) {			
			 D = findD(D, arr[i]);
		}
		
		System.out.println(D);
		
	}
	
	public static int findD(int a, int b){
		if(a%b==0) return b;
		return findD(b,a%b);
	}
	
}
