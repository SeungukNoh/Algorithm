import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] map;
	public static int one;
	public static int zero;
	public static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {

            String str = bf.readLine();
        	for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }
        
        divide(0, 0, N);
        System.out.println(sb);
    }
    
    public static void divide(int row, int col, int size) {

    	if(colorCheck(row, col, size)) {
    		sb.append(map[row][col]);
    		
    		return;
    	}
    	
    	int newSize = size/2;
    	
    	sb.append('(');
    	divide(row, col, newSize); // 2사분면
    	divide(row, col+newSize, newSize); // 1사분면
    	divide(row+newSize, col, newSize); // 3사분면
    	divide(row+newSize, col+newSize, newSize); // 4사분면
    	sb.append(')');
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