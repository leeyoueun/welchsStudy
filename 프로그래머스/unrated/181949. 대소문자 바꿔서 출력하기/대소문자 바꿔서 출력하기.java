import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String b = ""; 
        
        //a를 charAt으로 쪼개주고, for문을 통해 
        //대문자인지 소문자인지 구별해보자
        for(int i=0; i<a.length(); ++i){
            char c = a.charAt(i);
            if(65<=c&&c<=90){
                b+= String.valueOf(c).toLowerCase();
            } else if(97<=c&&c<=122){
                b+= String.valueOf(c).toUpperCase();
            }
        }
        
        System.out.println(b);
    }
}