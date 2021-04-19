package inflearn.timeComplexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {

    static List<Integer> solution(int[] arr1, int[] arr2){
        List<Integer> answer = new ArrayList<>();
        int p1 =0, p2 = 0;
        while (p1<arr1.length && p2<arr2.length){
            if (arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (arr1.length>p1) answer.add(arr1[p1++]);
        while (arr2.length>p2) answer.add(arr2[p2++]);


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[sc.nextInt()];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[sc.nextInt()];
        for (int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1,arr2)){
            System.out.print(x + " ");
        }
    }

}
