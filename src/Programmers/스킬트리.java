package Programmers;

import java.util.*;
    
public class 스킬트리 {

    public static void main(String[] args){
        Solution solution = new Solution();
        String skill="CBD";
        String[] skill_trees={"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution.solution(skill,skill_trees));
    }
    static class Solution{
        public int solution(String skill,String[] skill_trees){
            int answer=0;
            int temp=0;
            char[] inputSkill = skill.toCharArray();


            for(int i=0;i<skill_trees.length;i++){
                char[] skillTrees=skill_trees[i].toCharArray();
                Queue queue = new Queue(inputSkill.length);
                for(int j=0;j<skillTrees.length;j++){
                    for(int k=0;k<inputSkill.length;k++){
                        if(skillTrees[j]== inputSkill[k]){
                            queue.add(skillTrees[j]);
                            temp++;
                        }
                    }
                }
                queue.setQueue(new char[temp]);
                if(queue.equals(inputSkill)){
                    answer++;
                }
                temp=0;
            }



            return answer;
        }

        class Queue{
            char[] queue;
            int length;

            public Queue(int length){
                queue = new char[length];
            }

            public void add(char input){
                queue[length]=input;
                length++;
            }

            public char[] getQueue(){
                return this.queue;
            }
            public void setQueue(char[] queue){
                for(int i=0;i<queue.length;i++){
                    queue[i]=this.queue[i];
                }
                this.queue=queue;
            }

            public boolean equals(char[] chars){
                for(int i=0;i<queue.length;i++){
                    if(chars[i]!=queue[i]){
                        return false;
                    }
                }
                return true;
            }

        }
}

}
