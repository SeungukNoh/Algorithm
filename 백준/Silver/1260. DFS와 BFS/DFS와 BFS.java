import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	static int N;
	static int M;
	static int start;
	static boolean[] visited;
	static int[][] connect;
	
    public static void main(String[] args) throws IOException, NumberFormatException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	start = Integer.parseInt(st.nextToken());
    	
    	visited = new boolean[1001];
    	connect = new int[1001][1001];
    	
    	for(int i=0; i<M; i++) {
    		st = new StringTokenizer(bf.readLine()); 
    		int r = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());		
    		connect[r][c] = connect[c][r] = 1;
    	}
    	
    	dfs(start);
    	visited = new boolean[1001];
    	System.out.println();
    	
    	bfs(start);
    }
    
    public static void dfs(int node) {
    	visited[node] = true;
    	System.out.print(node +" ");
    	for (int i = 1; i < N+1; i++) {
			if(!visited[i] && connect[node][i]==1) {
				dfs(i);
			}
		}
    }
    
    public static void bfs(int node) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	queue.offer(node);
    	visited[node]=true;
    	System.out.print(node + " ");
    	
    	while(!queue.isEmpty()) {
    		int curr = queue.poll();
    		
    		for (int i = 1; i < N+1; i++) {
				if(!visited[i] && connect[curr][i]==1) {
					queue.offer(i);
					visited[i]=true;
					System.out.print(i + " ");
				}
			}
    	}
    }
}