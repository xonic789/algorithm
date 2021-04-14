package inflearn.string;

import java.util.Arrays;
import java.util.Scanner;

public class 유효한팰린드롬 {

    static String solution(String input){
        String answer = "";
        String temp = "";
        String lowerCaseInput = input.toLowerCase();
        String[] splitLowerCase = lowerCaseInput.split(" ");
        for (int i=0; i<splitLowerCase.length; i++){
            char[] chars = splitLowerCase[i].toCharArray();
            for(int j=0; j<chars.length; j++){
                if(Character.isAlphabetic(chars[j])){
                    temp+=chars[j];
                }
            }
            splitLowerCase[i] = temp;
            temp = "";
        }
        temp = "";
        for (String x : splitLowerCase){
            temp+=x;
        }
        StringBuilder sb = new StringBuilder(temp);
        if(sb.reverse().toString().equals(temp)){
            answer = "YES";
        }else
            answer = "NO";


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(explanation(sc.nextLine()));
    }

    static String explanation(String str){
        String answer = "NO";
        str=str.toUpperCase().replaceAll("[^A-Z]","");
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())) answer = "YES";
        return answer;
    }

}
