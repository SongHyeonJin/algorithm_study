package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Lec33 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<k-1; i++)
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
        int lt = 0;
        for(int rt=k-1; rt<n; rt++){
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0)+1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt])-1);
            if(hashMap.get(arr[lt]) == 0) hashMap.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec33 T = new Lec33();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for (int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }
}
