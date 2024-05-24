package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindChar {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()){
            if(t == x)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        FindChar T = new FindChar();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
