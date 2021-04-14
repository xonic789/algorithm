package inflearn;

import java.util.Scanner;

public class 특정문자뒤집기 {

    static String solution(String input){
        String answer = "";
        int lt = 0, rt = input.length()-1;

        char[] chars = input.toCharArray();
        while (lt<rt){
//            if('A'<=chars[lt]&&'z'>=chars[lt]&&'A'<=chars[rt]&&'z'>=chars[rt]){
//                char temp = ' ';
//                temp = chars[lt];
//                chars[lt] = chars[rt];
//                chars[rt] = temp;
//                lt++;
//                rt--;
//            }
            if(!Character.isAlphabetic(chars[lt]))lt++;
            if(!Character.isAlphabetic(chars[rt]))rt--;
            if(Character.isAlphabetic(chars[lt])&&Character.isAlphabetic(chars[rt])){
                char temp = ' ';
                temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextLine()));
    }
}
