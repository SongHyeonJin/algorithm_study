package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lec32 {
    public String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s1.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        for (char c : s2.toCharArray()){
            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) return "NO";
            hashMap.put(c, hashMap.get(c)-1);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec32 T = new Lec32();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(T.solution(a, b));
    }
}
