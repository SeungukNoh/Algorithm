import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int M;
	static int N;
	static int K;
	static boolean[][] visited;
	static int[][] graph;
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {-1,1,0,0};
	static int count;
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(bf.readLine());
    	

    	for (int i = 0; i < T; i++) {
        	StringTokenizer st = new StringTokenizer(bf.readLine());
        	M = Integer.parseInt(st.nextToken());
        	N = Integer.parseInt(st.nextToken());
        	K = Integer.parseInt(st.nextToken());
        	visited = new boolean[N][M];
        	graph = new int[N][M];
        	
        	for (int j = 0; j < K; j++) {
				st = new StringTokenizer(bf.readLine());
        		int x = Integer.parseInt(st.nextToken());
        		int y = Integer.parseInt(st.nextToken());
        		graph[y][x]=1;
			}
        	
        	int count =0;
        	
        	for (int j= 0; j < N; j++) {
        		for (int k = 0; k < M; k++) {
        			if(!visited[j][k] && graph[j][k]==1) {
        				dfs(k,j);
        				count++;
        			}
        		}
        	}
        	System.out.println(count); 
		}
    	
    }
    
    public static void dfs(int x, int y) {
    	
    	visited[y][x]=true;
    	
    	for (int i = 0; i < 4; i++) {
			int newx = x + dirX[i];
			int newy = y + dirY[i];
			
			if(newx < 0 || newy<0 || newx>=M || newy>=N) continue;
			
			if(!visited[newy][newx] && graph[newy][newx]==1) {
				dfs(newx, newy);
			}
		}
    }
    
}