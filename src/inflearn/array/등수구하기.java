package inflearn.array;

import inflearn.scanner.TestScanner;

import java.util.Scanner;

public class 등수구하기 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }

        for(int x : solution(n,input)){
            System.out.print(x + " ");
        }

    }

    private static int[] solution(int n, int[] input) {
        int[] answer = new int[n];
        int grade = 1;
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(input[i]<input[j]){
                    grade++;
                }
            }
            answer[i]=grade;
            grade=1;
        }
        return answer;
    }

}
