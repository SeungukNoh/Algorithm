import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(min(a,b));
		System.out.println(max(a,b));
	}
	
	public static int min(int a, int b) {
		if(a%b==0) return b;
		return min(b, a%b);
	}
	
	public static int max(int a, int b) {
		int m = min(a,b);
		return m*(a/m)*(b/m);
	}
}
