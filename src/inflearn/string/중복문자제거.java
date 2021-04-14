package inflearn.string;

import java.util.*;

public class 중복문자제거 {

    static String solution(String input){
//        Set set = new LinkedHashSet();
//        StringBuilder sb = new StringBuilder();
//        char[] chars = input.toCharArray();
//        for(char x : chars){
//            set.add(x);
//        }
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//
//            sb.append(iterator.next());
//        }
//
//        return sb.toString();
        String answer = "";
        for(int i=0; i<input.length(); i++){
            if(i==input.indexOf(input.charAt(i))){
                answer+=input.charAt(i);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));

    }
}
