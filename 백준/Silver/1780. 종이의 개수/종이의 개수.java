import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[][] map;
	public static int one;
	public static int zero;
	public static int minus;
	
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        map = new int[N][N];
        StringTokenizer st;
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        divide(0, 0, N);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }
    
    public static void divide(int row, int col, int size) {
    	if(colorCheck(row, col, size)) {
    		if(map[row][col]==0) zero++;
    		
    		else if(map[row][col]==1) one++;
    		
    		else minus++;
    		
    		return;
    	}
    	
    	int newSize = size/3;
    	
    	divide(row, col, newSize); // 키패드 1 위치
    	divide(row, col+newSize, newSize); // 키패드 2 위치
    	divide(row, col+2*newSize, newSize); // 키패드 3 위치
    	
    	divide(row+newSize, col, newSize); // 키패드 4 위치
    	divide(row+newSize, col+newSize, newSize); // 키패드 5 위치
    	divide(row+newSize, col+2*newSize, newSize); // 키패드 6 위치
    	
    	divide(row+2*newSize, col, newSize); // 키패드 7 위치
    	divide(row+2*newSize, col+newSize, newSize); // 키패드 8 위치
    	divide(row+2*newSize, col+2*newSize, newSize); // 키패드 9 위치
    	
    }
    
    public static boolean colorCheck(int row, int col, int size) {
    	int color = map[row][col]; // 시작점(원점)의 색
    	
    	for(int i=row; i<row+size; i++) {
    		for (int j = col; j < col+size; j++) {
    			if(map[i][j]!=color) return false; // 시작점의 색이 무엇이든, 같지 않다면 false
			}
    	}
    	
    	return true;
    }
    
}