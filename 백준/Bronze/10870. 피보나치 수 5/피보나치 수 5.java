import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(fn(n));
	}
	
	public static int fn(int a) {
		if(a==0) return 0;
		if(a==1) return 1;
		return fn(a-1)+fn(a-2);
	}
		
}
