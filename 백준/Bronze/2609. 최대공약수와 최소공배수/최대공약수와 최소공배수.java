import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(min(a,b));
		System.out.println(max(a,b));
	}
	
	public static int min(int x, int y) {
		if(x%y==0) return y;
		else return min(y, x%y);
	}
	
	public static int max(int x, int y) {
		return min(x,y)*(x/min(x,y))*(y/min(x,y));
	}

}
