import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException  {
		
		// 문자열 여러개에 대해 값 비교, 숫자 카운트 등을 하려하면, 인덱스를 알기 어렵거나 동적인 경우가 많다 -> 맵을 써보자
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
	
		HashMap<String,Integer> ys = new HashMap<>();
		for (int i = 0; i < N; i++) {
			ys.put(bf.readLine(), i);
		}
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i]=ys.get(bf.readLine());
		}
		
		int count = 0;
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if(arr[i]>arr[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}