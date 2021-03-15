package Programmers;

import java.util.*;

public class 완주하지못한선수 {
     
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution solution = new Solution();
        solution.solution(participant,completion);
    }
    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Arrays.sort(participant);
            Arrays.sort(completion);
            int i=0;
            while(i < completion.length){
                if(!participant[i].equals(completion[i])){
                    return participant[i];
                }else {
                    i++;
                }
            }
            if(answer.equals("")){
               return participant[participant.length-1];
            }


            return answer;
        }
    }
}