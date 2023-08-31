import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] A = new int[N];
            int[] B = new int[M];
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < N; j++) {    
                A[j] = Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < M; j++) {    
                B[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);
            Arrays.sort(B);
            int ans = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(A[j]>B[k]) ans++;
                    else break;
                }
            }
            System.out.println(ans);
        }
    }
}
