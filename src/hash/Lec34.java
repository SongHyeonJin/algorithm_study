package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lec34 {
    public int solution(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();
        for(char c : t.toCharArray()) hashMapT.put(c, hashMapT.getOrDefault(c, 0)+1);
        for(int i=0; i<t.length()-1; i++)
            hashMapS.put(s.charAt(i), hashMapS.getOrDefault(s.charAt(i), 0)+1);
        int lt = 0;
        for(int rt=t.length()-1; rt<s.length(); rt++){
            hashMapS.put(s.charAt(rt), hashMapS.getOrDefault(s.charAt(rt), 0)+1);
            if(hashMapS.equals(hashMapT)) answer++;
            hashMapS.put(s.charAt(lt), hashMapS.get(s.charAt(lt))-1);
            if(hashMapS.get(s.charAt(lt)) == 0) hashMapS.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec34 T = new Lec34();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        System.out.print(T.solution(s, t));
    }
}
