package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class State implements Comparable<State>{
    public int time;
    public char state;

    public State(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(State o) {
        if(this.time==o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}
public class Lec69 {
    public int solution(ArrayList<State> list){
        int answer= Integer.MIN_VALUE;
        Collections.sort(list);
        int cnt=0;
        for(State st : list){
            if(st.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec69 T = new Lec69();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<State> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new State(s, 's'));
            list.add(new State(e, 'e'));
        }
        System.out.println(T.solution(list));
    }
}
