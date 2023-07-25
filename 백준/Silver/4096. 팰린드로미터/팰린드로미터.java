import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break; // 마지막 입력 0
            
            int len = s.length(); // 숫자의 자리 수
            int num = Integer.parseInt(s); // 00012 -> 12
            int cnt = 0;
            
            while (!isPalindrome(len, num+(cnt++))) {}
            
            sb.append(cnt-1).append('\n');
        }
        
        System.out.print(sb);
    
	}

	// 문자열을 함수 인수로 넘기자니,, + 연산을 해야해서 인수가 좋을듯
	private static boolean isPalindrome(int len, int num) {
        
		String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        // 앞에 0 추가 ex 000
        for (int i = 0; i < len-str.length(); i++) {
            sb.append('0');
        }
        // 뒤에 숫자 추가 ex 00012
        sb.append(str);
        str = sb.toString();

		for(int i=0; i<len/2; i++) {			
			if(str.charAt(i)!=str.charAt(len-i-1)) return false;
		}
		return true;
	}
}