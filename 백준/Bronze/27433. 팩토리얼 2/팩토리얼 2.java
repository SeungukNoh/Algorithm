import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		long a = Long.parseLong(st.nextToken());
		System.out.println(factorial(a));		
	}
	
	public static long factorial(long a) {
		if(a<=1) {
			return 1;
		}
		return a*factorial(a-1);
	}
}
