import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] bmap;
	public static int[][] call;
	public static int ans;
	public static int count;
	public static int checkNum;
	
	public static void main(String[] args) throws IOException {
		bmap = new int[5][5]; // 내가 쓴 빙고판 입력받기
		StringTokenizer st;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ans = 0;
		for(int i=0; i<5; i++) {			
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < 5; j++) {
				bmap[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		call = new int[5][5]; // 사회자가 불러주는 입력받기
		for(int i=0; i<5; i++) {			
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < 5; j++) {
				call[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ans++;
				checkNum = call[i][j];
				binggo(checkNum);
				binggoCheck();
				if(count>=3) {
					System.out.println(ans);
					return;
				}
			}
		}
		
		
	} // main
	
	// check, isConnect, 중첩 for문...
	
	public static void binggo(int checkNum) {
		for (int i = 0; i < 5; i++) { // 시험자가 불러주는 값과 내 빙고판을 비교하고, 해당 칸을 -1로 값 변경
			for (int j = 0; j < 5; j++) {
				if(bmap[i][j]==checkNum) {
					bmap[i][j]=-1;
				}
			}
		}
	} // binggo
	
	public static void binggoCheck() {
		count=0;
		int x = 0;
		int y = 0;
		int yx = 0;
		int yMinusX = 0;
		
		for (int i = 0; i < 5; i++) { 
			x=0;
			y=0;
			
			for (int j = 0; j < 5; j++) { // 가로 줄 확인
				x = x + bmap[i][j];
				y = y + bmap[j][i]; 
				
			}
			if(x==-5) count++; // 가로 1줄 완성
			if(y==-5) count++; // 세로 1줄 완성
			
		}
		
		for (int i = 0; i < 5; i++) { // 2,4 사분면 대각선 줄 확인
			yMinusX = yMinusX + bmap[i][i];
			if(yMinusX==-5) count++; // 1줄 완성
		}
		
		
		for (int i = 0; i < 5; i++) { // 1,3 사분면 대각선 줄 확인
			yx = yx + bmap[i][4-i];
			if(yx==-5) count++; // 1줄 완성
		}
		
	}// binggoCheck

} // class
