import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	     while(true) {
	    	 
	    	 String test = bf.readLine();
	    	 boolean ans = true;
	    	 if(test.equals("0")) break; // 0 입력 시 종료
	    	 int n = test.length(); // 자리 수
	    	 
	    	 for(int i=0; i<n/2; i++) {
	    		 if(test.charAt(i)!=test.charAt(n-i-1)) ans = false;
	    	 }
	    	 
	    	 if(ans) System.out.println("yes");
	    	 else System.out.println("no");
	     }
	}

}
