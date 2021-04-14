package inflearn.string;

import java.util.Scanner;

public class 가장짧은문자거리 {

    static int[] solution(String str){
        String[] split = str.split(" ");
        int point = 1000;
        int[] answer = new int[split[0].length()];
        for(int i=0; i<split[0].length(); i++){
            if(split[0].charAt(i)!=split[1].charAt(0)){
                answer[i] = ++point;
            }else
                answer[i] = point = 0;
        }
        point = 1000;
        for (int i=split[0].length()-1; i>-1; i--){
            if(split[0].charAt(i)!=split[1].charAt(0)){
                if(answer[i]>point)
                answer[i] = ++point;
            }else
                answer[i] = point = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] solution = solution(sc.nextLine());
        for (int x : solution){
            System.out.print(x + " ");
        }
    }

}
