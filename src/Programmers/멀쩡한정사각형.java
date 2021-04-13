package Programmers;

import java.math.BigInteger;

public class 멀쩡한정사각형 {

    static long solution(int w, int h){
        long answer = 1L;

        return ((long)w *(long)h) - unusableSquare(w,h);
    }

    private static long unusableSquare(int w, int h) {
//        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        int gcd = (int) gcd(w,h);
        return ((long)(w/gcd)+(long)(h/gcd)-1) * gcd;
    }

    public static void main(String[] args){

        System.out.println(solution(12,8));
    }

    private static long gcd(int width,int height){
        if(width>height){
            if(height==0){
                return width;
            }
            return gcd(height,width%height);
        }
        else{
            if(width==0){
                return height;
            }
           return gcd(width,height%width);
       }
    }
}
