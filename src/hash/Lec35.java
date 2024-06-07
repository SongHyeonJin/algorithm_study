package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Lec35 {
    public int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++)
                for(int l=j+1; l<n; l++)
                    Tset.add(arr[i]+arr[j]+arr[l]);
        int cnt = 0;
        for (int i : Tset){
            cnt++;
            if(cnt==k) answer = i;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec35 T = new Lec35();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, k, arr));
    }
}
