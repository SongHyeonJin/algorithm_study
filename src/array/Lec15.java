package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec15 {
    public String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] > b[i]) {
                if (a[i] - b[i] == 1) answer += "A";
                else if (a[i] - b[i] == 2) answer += "B";
                else answer += "D";
            }else if(a[i] < b[i]){
                if (b[i] - a[i] == 1) answer += "B";
                else if (b[i] - a[i] == 2) answer += "A";
                else answer += "D";
            }else answer += "D";
            answer += "\n";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec15 T = new Lec15();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String aStr = br.readLine();
        String bStr = br.readLine();
        String[] aVal = aStr.split(" ");
        String[] bVal = bStr.split(" ");
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(aVal[i]);
        for(int i=0; i<n; i++)
            b[i] = Integer.parseInt(bVal[i]);
        System.out.println(T.solution(n, a, b));
    }
}
