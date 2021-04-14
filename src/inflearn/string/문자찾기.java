package inflearn.string;

import java.util.Scanner;

public class 문자찾기 {

    static int solution(String input,String compareChar){
        int answer = 0;
        String s = input.toLowerCase();
        String s1 = compareChar.toLowerCase();

        for (int i = 0; i < input.length(); i++){
            if (s.charAt(i) == s1.charAt(0)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next(),sc.next()));
    }
}
