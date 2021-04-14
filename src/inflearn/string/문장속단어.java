package inflearn.string;

import java.util.Scanner;

public class 문장속단어 {

    static String solution(String input){
        String answer = "";
        int minValue = Integer.MIN_VALUE;
        String[] s = input.split(" ");
        for(String x : s){
            int length = x.length();
            if(length>minValue){
                minValue=length;
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
