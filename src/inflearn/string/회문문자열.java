package inflearn.string;

import java.util.Scanner;

public class 회문문자열 {

    static String solution(String input){
//        String s1 = input.toLowerCase();
//        StringBuilder sb = new StringBuilder(s1);
//        String s = sb.reverse().toString();
//        if (s1.equalsIgnoreCase(s)){
//            return "YES";
//        }else
//            return "NO";
        String answer = "NO";
        input = input.toLowerCase();
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)) return answer;
            else answer="YES";
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }

}
