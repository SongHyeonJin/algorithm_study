package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Brick implements Comparable<Brick>{
    public int s, h, w;
    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s-this.s;
    }
}
public class Lec77 {
    static int[] dy;
    public int solution(ArrayList<Brick> arr){
        int answer=0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];
        for(int i=1; i<arr.size(); i++){
            int maxH = 0;
            for(int j=i-1; j>=0; j--)
                if(arr.get(j).w>arr.get(i).w && dy[j]>maxH) maxH = dy[j];
            dy[i] = maxH+arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec77 T = new Lec77();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Brick(a, b, c));
        }
        System.out.println(T.solution(arr));
    }
}
