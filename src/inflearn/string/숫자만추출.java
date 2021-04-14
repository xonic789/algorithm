package inflearn.string;

import java.util.Scanner;

public class 숫자만추출 {

    static int solution(String str){
        int answer = 0;
        str=str.replaceAll("[^0-9]","");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.next()));
    }

    static int explanation(String str){
        int answer = 0;
        for (char x:str.toCharArray()){
            if (x >= '0' && x <= '9'){
                answer = answer * 10 + (x - '0');
            }
        }

        return answer;
    }
}
