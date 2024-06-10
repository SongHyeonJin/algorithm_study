package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Lec41 {
    public int solution(int n, int k){
        int answer = 0;
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) queue.offer(i);
        while (queue.size() > 1){
            if(cnt == k){
                queue.remove();
                cnt = 1;
            }else {
                queue.offer(queue.poll());
                cnt++;
            }
        }
        answer = queue.peek();
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec41 T = new Lec41();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, k));
    }
}
