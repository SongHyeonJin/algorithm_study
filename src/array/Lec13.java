package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lec13 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<arr.length; i++)
            if(arr[i] > arr[i-1])
                answer.add(arr[i]);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec13 T = new Lec13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String str = br.readLine();
        String[] strs = str.split(" ");
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(strs[i]);
        for(int x : T.solution(n, arr))
            System.out.print(x + " ");
    }
}
