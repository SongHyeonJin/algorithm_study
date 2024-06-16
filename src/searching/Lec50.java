package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Lec50 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrayList.add(new Point(x, y));
        }
        Collections.sort(arrayList);
        for (Point o : arrayList)
            System.out.println(o.x+" "+o.y);
    }
}
class Point implements Comparable<Point> {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
