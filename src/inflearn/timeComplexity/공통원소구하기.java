package inflearn.timeComplexity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {

    static List<Integer> solution(int[] arr1, int[] arr2){
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 =0, p2=0;
        while (p1<arr1.length && p2<arr2.length) {
            if(arr1[p1]==arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            }else if(arr1[p1]<arr2[p2]){
                p1++;
            }else {
                p2++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[sc.nextInt()];
        for (int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[sc.nextInt()];
        for (int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1,arr2)){
            System.out.print(x + " ");
        }
    }

}
