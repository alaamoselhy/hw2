
import java.util.*;
public class task {
    
    public static void main(String[] args){
         Scanner Scanner = new Scanner(System.in);
        System.out.print("please enter any string");
        String reverse = "";
        String original =Scanner.nextLine();
        original =original.replace(" ","");
        original =original.toLowerCase();
        original =original.replaceAll("[, :]", "");
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
       if (original.equals(reverse))
         System.out.print("true");
         else
             System.out.print("false");
       System.out.print(original);
        System.out.print(reverse);
    }
    }

