import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String[] arr = new String[T];
        
        for(int i=0; i<T; i++) {
        	arr[i]=sc.next();
        	
        	boolean ans = true;
        	int count=0;
        	
        	for (int j = 0; j < arr[i].length(); j++) {
        		String str = arr[i];
        		char sub = str.charAt(j);
        		
        		if(sub=='(') count++;
        		else if(sub==')') count--;
        		
        		if(count<0) ans=false;

			}
        	if(count==0 && ans) System.out.println("YES");
        	else System.out.println("NO");
        }
	
	}
}