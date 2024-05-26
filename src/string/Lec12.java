package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec12 {
    public String solution(int n, String str){
        String answer = "";
        int idx = 0;
        for(int i=0; i<n; i++){
            int binary = 0;
            int num = 0;
            int multiple = 1;
            String s = str.substring(idx, idx+7);
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '#'){
                    binary += 1;
                }
                else if(s.charAt(j) == '*'){
                    binary += 0;
                }
                binary *= 10;
            }
            binary /= 10;
            for(int j=0; j<s.length(); j++){
                if(binary%10 == 1){
                    num += binary%10 * multiple;
                }
                multiple *= 2;
                binary /= 10;
            }
            char c = (char) num;
            answer += c;
            idx += 7;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec12 T = new Lec12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(n, str));
    }
}
