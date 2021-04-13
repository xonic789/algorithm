package Programmers;

import java.util.Objects;

public class 방문길이 {

    public static int solution(String dirs){
        char[] moves = dirs.toCharArray();
        int x = 0, y = 0;
        int tempx=0, tempy=0;
        int answer = 0;

        int[][] location = new int[dirs.length()][2];

        for (int i=0; i<moves.length; i++){
            if (location[i][0]<=5&&location[i][0]>=-5&&location[i][1]<=5&&location[i][1]>=-5){
                if (moves[i]=='R'){
                    x++;
                    if(!isVisited(x,y,location,i)){
                        location[i][0]= x;
                        location[i][1]= y;
                        answer++;
                    }
                }
                if (moves[i]=='U'){
                    y++;
                    if(!isVisited(x,y,location,i)){
                        location[i][0]= x;
                        location[i][1]= y;
                        answer++;
                    }
                }
                if (moves[i]=='L'){
                    x--;
                    if(!isVisited(x,y,location,i)){
                        location[i][0]= x;
                        location[i][1]= y;
                        answer++;
                    }
                }
                if (moves[i]=='D'){
                    y--;
                    if(!isVisited(x,y,location,i)){
                        location[i][0]= x;
                        location[i][1]= y;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean isVisited(int x,int y,int[][] location,int count){
        for(int i=0; i<location.length; i++){
            if(count!=i){
                if(location[i][0]==x&&location[i][1]==y){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("LULLLLLLU"));
    }


    static class Location{
        private int x;
        private int y;




        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location location = (Location) o;
            return x == location.x && y == location.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
