package inflearn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기 {

    static List<Integer> solution(int n,int[] input){
        List<Integer> answer = new ArrayList<>();
        answer.add(input[0]);
        for (int i=1; i<n; i++){
            if(input[i]>input[i-1]) answer.add(input[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }
        for (int x : solution(n, input)){
            System.out.print(x + " ");
        }
    }
}
