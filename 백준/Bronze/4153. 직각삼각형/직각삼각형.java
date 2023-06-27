import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result;
		if((a+b+c)==0) break;
		int maxlen = Math.max(Math.max(a, b),c);
		if(a*a + b*b + c*c == 2*maxlen*maxlen) result = "right";
		else  result ="wrong";
		System.out.println(result);
		
		
		}
		}
	}