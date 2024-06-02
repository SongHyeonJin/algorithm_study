package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lec18 {
    public boolean isPrime(int num){
        if (num == 1) return false;
        for(int i=2; i<num; i++)
            if(num%i==0) return false;
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp /= 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec18 T = new Lec18();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String str = br.readLine();
        String[] strs = str.split(" ");
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(strs[i]);
        for (int x : T.solution(n, arr))
            System.out.print(x+" ");
    }
}
