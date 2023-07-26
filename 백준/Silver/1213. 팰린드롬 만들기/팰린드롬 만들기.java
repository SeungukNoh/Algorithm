import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//주어진 알파벳의 종류가 제한되어 있다. 
// 숫자처럼 하나씩 늘리는 것이 불가능함(아스키 코드 활용은 어렵겠다)
// 정렬 한 다음 하나씩 자리를 바꿔가며 탐색을 해야겠는데..
// 바꾸는 로직을 어떻게 해야하지?
// 사전 순으로 가장 앞선 것 출력이기 때문에 맨 앞에 A를 건드리면 안될 것 같다.
// 대칭인 자리를 바꾸는건 아무 의미 없다.
// 한자리씩 바꿔도 다 탐색이 되나? 두개를 동시에 바꿔야 되는 경우는?
// 두개 이상 자리를 옮겨야하는 경우도 있겠는데.. 그럼 3개, 4개 확장돼서 너무 복잡해
// n!로 싹 다 뒤져볼까? 그럼 입력받고 정렬 안해도 되고...
// n! 다 확인하고, 되는 것들 배열에 담고, 정렬해서 맨 앞에거 출력 해보자
// n!을 다 어떻게 찾지... 배열 자리 바꾸기 해도 안될 것 같다,,
// 아.. 짝수 홀수 방식의 접근은 잘 떠올리던건데 어쩌다 저런 구렁텅이에 빠졌을까...ㅅㅂ

public class Main{
    static int[] alphabet = new int[26];	//알파벳 개수 저장 배열
    static StringBuilder sb = new StringBuilder();	//결과 저장할 StringBuilder
    static StringBuilder front = new StringBuilder();
    static StringBuilder end = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        
    	//입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = br.readLine();
        boolean check = false;	//팰린드롬 만들 수 있는지 확인 변수
        int oddCheck = 0;		//알파벳 홀수인 개수
        char mid = '0';
        //알파벳 개수를 구하기
        for(int i=0;i<name.length();i++)
            alphabet[name.charAt(i) - 65]++;

        //팰린드롬 만들기
        for(int i=0;i< alphabet.length;i++){
            if(alphabet[i] != 0 && alphabet[i]%2 == 1){
                if(oddCheck==0){	//홀수가 1개가 될 때
                    oddCheck++;
                    mid = (char)('A' + i);	//mid구하기
                }else{	//홀수가 2개가 될 때
                    //팰린드롬 만들지 못하기 때문에 "I'm Sorry Hansoo"를 저장
                    sb = new StringBuilder("I'm Sorry Hansoo");
                    check = true;
                    break;
                }
            }
            //"개수 ÷ 2"만큼 front, end 구성 
            for(int j=0;j<alphabet[i]/2;j++){
                front.append((char)('A' + i));
                end.insert(0, (char)('A' + i));
            }
        }
        if(!check){		//팰린드롬 만들었을 때
            if(mid == '0')	//홀수 개수가 0개일 때
                sb.append(front).append(end);	//front + end
            else		//홀수 개수가 1개일 때
                sb.append(front).append(mid).append(end);	//front + mid + end
        }

        bw.write(sb.toString());		//팰린드롬 BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}