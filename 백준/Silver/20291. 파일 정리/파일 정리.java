import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String name = bf.readLine();
			String file = name.substring(name.indexOf(".")+1); // 확장자의 자리 수가 가변적이기 때문에.. "."의 인덱스 뒷자리부터 끝까지 출력
			 map.put(file, map.getOrDefault(file, 0)+1);
		}
		
		Set<String> strings = map.keySet();
		 
        List<String> list = new ArrayList<>(strings);
 
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" "+map.get(list.get(i)));
        }
	}
}