package inflearn.string;

import java.util.Scanner;

public class 암호 {

    static String solution(int n,String str){
        String answer = "";
        for (int i=0; i<n; i++){
            String temp = str.substring(i*7, (i+1)*7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(temp, 2);
            answer+=(char)num;
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextInt(),sc.next()));
    }
}
