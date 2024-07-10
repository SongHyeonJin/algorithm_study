package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int date;
    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }
    @Override
    public int compareTo(Lecture o) {
        return o.date-this.date;
    }
}
public class Lec70 {
    static int n, max = Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr){
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).date<i) break;
                priorityQueue.offer(arr.get(j).money);
            }
            if(!priorityQueue.isEmpty()) answer += priorityQueue.poll();
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec70 T = new Lec70();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr.add(new Lecture(m, d));
            if(d>max) max=d;
        }
        System.out.println(T.solution(arr));
    }
}
