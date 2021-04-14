package inflearn.string;

public class 대소문자변환 {

    static String solution(String target){
        String answer = "";
        char[] chars = target.toCharArray();
        for (int i=0; i<chars.length; i++){
            if(chars[i]>='a'&&chars[i]<='z'){
                chars[i]-=32;
            }else {
                chars[i]+=32;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(solution("aAbcDS"));
    }

}