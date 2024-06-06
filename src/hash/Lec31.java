package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lec31 {
    public char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : str.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);

        int max = Integer.MIN_VALUE;
        for (char key : hashMap.keySet()){
            if(hashMap.get(key) > max){
                max = hashMap.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec31 T = new Lec31();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(n, str));
    }
}
