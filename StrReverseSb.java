import java.util.*;

public class StrReverseSb {

/* Reverse String using String bulider Class */
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello World");

        for(int i =0; i<sb.length()/2; i++){
            int front =i;
            int back = sb.length()-i-1;
             char frontChar = sb.charAt(front);
             char backchar = sb.charAt(back);

             sb.setCharAt(front, backchar);
             sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}


