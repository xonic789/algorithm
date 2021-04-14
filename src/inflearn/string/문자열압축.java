package inflearn.string;

import java.util.Scanner;

public class 문자열압축 {

    static String solution(String str){
        String answer = "";
        int cnt = 1;
        str=str+" ";
        for (int i=0; i<str.length()-1; i++){
            if(str.charAt(i)== str.charAt(i+1)) cnt++;
            else{
                answer+=str.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);
                }
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }
}
