package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time>{
    int s, e;
    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}
public class Lec68 {
    public int solution(ArrayList<Time> arr, int n){
        int cnt=0;
        Collections.sort(arr);
        int et = 0;
        for(int i=0; i<n; i++){
            if(arr.get(i).s>=et){
                et=arr.get(i).e;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        Lec68 T = new Lec68();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.add(new Time(s, e));
        }
        System.out.println(T.solution(arr, n));
    }
}
