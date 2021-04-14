package inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기 {

    static List<String> solution(int n , String[] input){
        List<String> answer = new ArrayList<>();
        for (String x : input){
            char[] s = x.toCharArray();
            int lt = 0, rt=x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        for (int i=0; i<n; i++){
            input[i] = sc.next();
        }

        for (String x : solution(n, input)){
            System.out.println(x);
        }

    }
}
