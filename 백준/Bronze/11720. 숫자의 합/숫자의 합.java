import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String s= bf.readLine();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i]=s.substring(i,i+1);
		}
		int sum =0;
		
		for(int i=0; i<N; i++) {
			sum=sum+Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}

}
