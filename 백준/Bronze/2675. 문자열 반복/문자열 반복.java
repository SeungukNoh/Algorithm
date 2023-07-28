import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
  
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(bf.readLine());
    	
    	for(int i=0; i<T; i++) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		
    		int R = Integer.parseInt(st.nextToken());
    		
    		String str = st.nextToken();
    		
    		for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(str.charAt(j));
				}
			}
    		System.out.println();
    	}
    	
    }
}

